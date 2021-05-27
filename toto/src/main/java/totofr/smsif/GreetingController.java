package totofr.smsif;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Autowired
	private SimpMessagingTemplate simpMessagingTemplate;
	
	@Autowired
	private CoupureService service;

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public String greeting(Greeting name) throws Exception {
    	return String.format("%s has joined the room", name.getContent());
    }
    
    @Scheduled(fixedRate = 1000)
    public void compteur() {
    	if(service.isCouper())
    		this.simpMessagingTemplate.convertAndSend("/topic/greetings", String.format("the time now is %s", dateFormat.format(new Date())));
    }

}

package totofr.smsif;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class GreetingController {
	
	@Autowired
	private SimpMessagingTemplate simpMessagingTemplate;
	
	@Autowired
	private CoupureService service;

    @MessageMapping("/ecrire")
    public void greeting(Greeting greeting) throws Exception {
    	
    	if(service.getEnableTopics().contains(greeting.getKey())) {
    		try {
    			log.error("/topic/"+greeting.getKey());
    			this.simpMessagingTemplate.convertAndSend("/topic/"+greeting.getKey(), String.format("%s => %s", greeting.getLogin(), greeting.getContent()));
			} catch (Exception e) {
				log.error(e.getMessage(), e);
			}
    		
    	}
    		
    }
    

}

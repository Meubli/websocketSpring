package totofr.smsif;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin
@RequestMapping(value = "/coupure")
@Slf4j
public class CoupureController {
	
	@Autowired
	private CoupureService service;
	
	@GetMapping(path="/on")
    public void couper(){
    	service.setCouper(true);
    }
	
	@GetMapping(path="/off")
    public void retablir(){
    	service.setCouper(false);
    }

}

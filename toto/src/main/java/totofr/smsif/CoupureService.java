package totofr.smsif;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;

@Service
@Getter @Setter
public class CoupureService {
	
	
	private boolean couper = false;
	
	
	List<String> enableTopics = new ArrayList<>();

}

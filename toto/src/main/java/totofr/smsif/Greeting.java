package totofr.smsif;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Greeting {

    private String content;
    
    private String key;
    
    private String login;

    public Greeting() {
    }

    public Greeting(String content) {
	this.content = content;
    }

}

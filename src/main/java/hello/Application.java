package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() throws InterruptedException {
		
		String[] text = {""};
    	
    	Thread.sleep(300);
    	
    	text[0] = "Olá mundo!";
    	
    	return text[0];
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

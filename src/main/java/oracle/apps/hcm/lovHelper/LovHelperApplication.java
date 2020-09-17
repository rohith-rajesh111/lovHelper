package oracle.apps.hcm.lovHelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class LovHelperApplication {

	public static void main(String[] args) {
		SpringApplication.run(LovHelperApplication.class, args);
	}
	
}

package in.kaifee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cctx=SpringApplication.run(Application.class, args);
		
		Car c=cctx.getBean(Car.class);
		System.out.println(cctx.getClass().getName());
	}

}

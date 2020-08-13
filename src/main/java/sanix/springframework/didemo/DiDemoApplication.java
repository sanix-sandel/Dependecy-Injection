package sanix.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sanix.springframework.didemo.controllers.MyController;
import sanix.springframework.didemo.controllers.PropertyInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(DiDemoApplication.class, args);
	//	SpringApplication.run(DiDemoApplication.class, args);
		MyController controller =(MyController) ctx.getBean("myController");
		controller.hello();

	}

}

package com.vergilov;

import com.vergilov.controllers.ConstructorInjectedController;
import com.vergilov.controllers.MyController;
import com.vergilov.controllers.PropertyInjectedController;
import com.vergilov.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}

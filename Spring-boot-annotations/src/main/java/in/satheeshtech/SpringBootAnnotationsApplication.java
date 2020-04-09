package in.satheeshtech;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication

public class SpringBootAnnotationsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootAnnotationsApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("colBean",College.class);
		System.out.println("the college object created by spring is :"+college);
		college.Test();
		((AnnotationConfigApplicationContext)context).close();
		
	}

}

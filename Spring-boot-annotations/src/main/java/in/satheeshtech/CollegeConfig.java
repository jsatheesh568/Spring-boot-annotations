/**
 * 
 */
package in.satheeshtech;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Satheesh
 *
 */
@Configuration
//@ComponentScan(basePackages = "in.satheeshtech")
public class CollegeConfig {
	@Bean
	public principal principalBean()
	{
		return new principal();
	}
	
	@Bean(name="colBean")
	public College CollegeBean()
	{
		College college=new College();
		college.setPrincipal(principalBean());
		college.setTeacher(mathTeacherBean());
		return college;
	}
	@Bean
	public Teacher mathTeacherBean()
	{
		return new MathTeacher();
	}
	

}

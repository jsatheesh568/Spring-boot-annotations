/**
 * 
 */
package in.satheeshtech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * @author Satheesh
 *
 */
//@Component("collegeBean")
public class College {
	private principal principal;
	private Teacher teacher;
	
	
	/*
	 * public College(principal principal) { this.principal=principal; }
	 */
	
	/**
	 * @param teacher the teacher to set
	 */
	@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public void Test()
	{
		principal.principalInfo();
		teacher.teach();
		System.out.println("College Test method");
	}

	
	/**
	 * @param principal the principal to set
	 */
	@Bean
	@Autowired
	public void setPrincipal(principal principal) {
		this.principal = principal;
		
	}

}

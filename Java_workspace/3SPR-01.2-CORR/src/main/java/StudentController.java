import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] {"applicationContext.xml"});
				Student obj=(Student)appContext.getBean("s1");
				obj.display();
				obj=(Student)appContext.getBean("s2");
				obj.display();
				appContext.close();
	}

}

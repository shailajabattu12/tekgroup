import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Student d=(Student) context.getBean("myid");
		System.out.println(d.toString());
	}
}

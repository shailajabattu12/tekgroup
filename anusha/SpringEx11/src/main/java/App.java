import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Customer cust=(Customer)context.getBean("CustomerBean");
		System.out.println(cust);
	}

}

package tv.stardream.Proton.dracula.functional.YJTest;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SomeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-test.xml");
		Person person=(Person)ctx.getBean("chinese");
		person.worker();
		
		System.out.println(ctx);
		HashMap map = new HashMap();
		map.put("1",ctx);
		ApplicationContext ctx1 = (ApplicationContext)map.get("1");
		System.out.println(ctx.equals(ctx1));
		
		//HashBiMap bimap = new HashBiMap();
	}

}

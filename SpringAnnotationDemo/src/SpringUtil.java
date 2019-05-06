import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Product;

public class SpringUtil 
{
	public static void main(String arg[])
	{
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		Product product=(Product)context.getBean("product");
		System.out.println(product.getProductId());
	}
}

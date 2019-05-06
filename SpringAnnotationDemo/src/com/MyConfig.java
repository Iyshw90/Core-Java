package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig 
{
	@Bean(name="product")
	public Product getProductBean()
	{
		System.out.println("Bean Method called");
		Product product=new Product();
		product.setProductId(1001);
		product.setProductName("Watch");
		return product;
	}
}

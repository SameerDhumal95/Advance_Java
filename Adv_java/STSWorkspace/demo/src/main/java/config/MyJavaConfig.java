package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import study.beans.AddressBean;
import study.beans.MessageBean;

@Configuration  
public class MyJavaConfig {

	@Bean(value="msg")
	@Scope(value="prototype")
	public MessageBean getMessageBean()
	{
	     MessageBean bean = new MessageBean();
	     bean.setMessage("This is from Java Config");
	     bean.setSenderName("SHAKTIMAN");
	     bean.setReceiverAddress(getAddr());
	     return bean;
	}
	
	@Bean(value="msg2")
	public MessageBean getMessageBean2()
	{
	     MessageBean bean = new MessageBean("this is from config2","Nobita",getAddr());
	     
	     return bean;
	}

	
	//we register the bean with the container
	@Bean(value="addr")
	@Lazy
	public AddressBean getAddr()
	{
		AddressBean bean = new AddressBean();
		bean.setCity("Pune");
		bean.setState("mah");
		bean.setCountry("ind");
		bean.setPin("1245");
		return bean;
	}
	
	
}

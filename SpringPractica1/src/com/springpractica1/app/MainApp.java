package com.springpractica1.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.springpractica1.model.ClienteBean;

public class MainApp {

	public static void main(String[] args) {
		
		//Forma clasica de crear objetos
		ClienteBean axel = new ClienteBean();
		axel.setId("1");
		axel.setNombre("Axel");
		axel.setDomicilio("Ijalti");
		axel.setEdad(25);
		axel.setTelefono("");
		System.out.println("Cliente Axel: " + axel.toString());
		
		//forma Inversion of control (IOC)
		//Spring way
		//revisar ClienteBeans.xml
		//Resource resource = new ClassPathResource("ClienteBeans.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		ApplicationContext context = new ClassPathXmlApplicationContext("ClienteBeans.xml");
		ClienteBean cliente1 =(ClienteBean) context.getBean("Neltzy");
		//cliente1 = context.getBean("Neltzy", ClienteBean.class);
		ClienteBean cliente2 = (ClienteBean) context.getBean("Gerardo");
		
		/*
		ClienteBean cliente1 =(ClienteBean) factory.getBean("Neltzy");
		//cliente1 = factory.getBean("Neltzy", ClienteBean.class);
		ClienteBean cliente2 = (ClienteBean) factory.getBean("Gerardo");
		*/
		System.out.println(cliente1);
		System.out.println(cliente2);
	}

}

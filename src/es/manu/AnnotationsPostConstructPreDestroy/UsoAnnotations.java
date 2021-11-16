package es.manu.AnnotationsPostConstructPreDestroy;


import org.springframework.stereotype.Component;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		
		
		//leer el xml de configuracion
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("contextPostConstrucPreDestroy.xml"); 
		
		//pedir un bean al contenedor
		
		Empleados comercial = contexto.getBean("comercialExperimentado", Empleados.class);
		
		Empleados comercial2 = contexto.getBean("comercialExperimentado", Empleados.class);
		
		// usar el bean
		
		if (comercial==comercial2) {
			System.out.println("Esta utilizando Singleton \n" + comercial +"\n" + comercial2);}
		else {
			System.out.println("Esta utilizando Prototype  no puntan al mismo lugar de memoria\n" + comercial +"\n" + comercial2);
		}
		
	
		
		//cerrar el contexto
		
		contexto.close();

	}

}

package es.manu.pruebaAnnotationsAutowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		
		
		//leer el xml de configuracion
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("appicationContextAnnottationsAutowired.xml"); 
		
		//pedir un bean al contenedor
		
		Empleados comercial = contexto.getBean("comercialExperimentado", Empleados.class);
		
		// usar el bean
		
		System.out.println(comercial.getInforme());
		
		System.out.println(comercial.getTaareas());
		
		//cerrar el contexto

	}

}

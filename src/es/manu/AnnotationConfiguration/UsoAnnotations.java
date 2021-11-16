package es.manu.AnnotationConfiguration;


import org.springframework.stereotype.Component;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		
		
		
		
		//leer el xml de configuracion
		
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("contextPostConstrucPreDestroy.xml");
		
		// leer el class de configuracion
		
		//YA NO NECESITAMOS EL XML DE CONFIGURACION, PORQUE HEMOS CREADO la clase EmpleadosConfig con la etiqueta 
		//@Configuration @ComponentScan("es.manu.AnnotationConfiguration")
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosCongif.class);
		
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

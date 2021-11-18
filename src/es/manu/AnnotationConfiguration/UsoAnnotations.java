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
		
		System.out.println("Empleados comercial2 = contexto.getBean(\"comercialExperimentado\", Empleados.class)");
		
		System.out.println(comercial2.getInforme());
		
		System.out.println(comercial2.getTaareas()+"\n\n");
		
		
		Empleados comercialex = contexto.getBean("comercialExperimentado", ComercialExperimentado.class);
		
		//comercialex solo metodos de Empleados
		
		System.out.println("Empleados comercialex = contexto.getBean(\"comercialExperimentado\", ComercialExperimentado.class);");
		
		System.out.println(comercialex.getInforme());
		
		System.out.println(comercialex.getTaareas()+ "\n\n");
		
		
		
		
		ComercialExperimentado comercialex2 = contexto.getBean("comercialExperimentado", ComercialExperimentado.class);
		
		//comercialex2 solo metodos de comercialExperimentado
		
		System.out.println("ComercialExperimentado comercialex2 = contexto.getBean(\"comercialExperimentado\", ComercialExperimentado.class);");
		
		System.out.println(comercialex2.getInforme());
		
		System.out.println(comercialex2.getTaareas()+ "\n\n");
		
		
		
		
		
		// usar el bean
		
		if (comercial==comercial2) {
			System.out.println("Esta utilizando Singleton \n" + comercial +"\n" + comercial2+ "\n\n");}
		else {
			System.out.println("Esta utilizando Prototype  no puntan al mismo lugar de memoria\n" + comercial +"\n" + comercial2);
		}
		
	
		
		//cerrar el contexto
		
		contexto.close();

	}

}

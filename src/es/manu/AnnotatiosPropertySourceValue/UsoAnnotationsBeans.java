package es.manu.AnnotatiosPropertySourceValue;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotationsBeans {

	public static void main(String[] args) {

		// leer el xml de configuracion

		// YA NO NECESITAMOS EL XML DE CONFIGURACION, PORQUE HEMOS CREADO la clase
		// EmpleadosConfig con la etiqueta
		// @Configuration @ComponentScan("es.manu.AnnotationConfiguration")

		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);

		// pedir un bean al contenedor

		Empleados comercial = contexto.getBean("directorFinancieroO", Empleados.class);

		Empleados comercial2 = contexto.getBean("comercialExperimentado", Empleados.class);

		ComercialExperimentado comercial3 = contexto.getBean("comercialExperimentado", ComercialExperimentado.class);

		DirectorFinanciero comercial4 = contexto.getBean("directorFinancieroO", DirectorFinanciero.class);

		
		System.out.println(comercial4.getEmail());
		System.out.println(comercial4.getNobreEmpresa());
		System.out.println(comercial4.getInforme());
		System.out.println(comercial4.getTaareas());
		
		
		

		// cerrar el contexto

		contexto.close();

	}

}

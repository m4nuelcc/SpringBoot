package es.manu.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {

// **********************UTILIZANDO SPRING***************************

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("appicationContext.xml");

		Empleados Manu = contexto.getBean("miEmpleado", Empleados.class);

		System.out.println(Manu.getTareas());

		Empleados Manu1 = contexto.getBean("miJefeEmpleado", Empleados.class);

		System.out.println(Manu1.getTareas());

		System.out.println(Manu.getInforme());

		System.out.println(Manu1.getInforme());

	

		// INYECCION CON SETTERS

		Empleados secre = contexto.getBean("miSecretario", Empleados.class);

		System.out.println(secre.getTareas());

		System.out.println(secre.getInforme());

		// IMPRIMIENDO DATOS INYECTADOS

		SecretarioEmpleado secreDatos = contexto.getBean("miSecretario", SecretarioEmpleado.class);

		System.out.println("Email secretarios : " + secreDatos.getEmail());

		System.out.println("Empresa: " + secreDatos.getNombreEmpresa());
		
		
		JefeEmpleado jefeDatos = contexto.getBean("miJefeEmpleado", JefeEmpleado.class);

		System.out.println("Email jefes: " + jefeDatos.getEmail());

		System.out.println("Empresa: " + jefeDatos.getNombreEmpresa());

		contexto.close();

		

		contexto.close();
		
		

//*******************************************************************		
//					SIN SPRING
//
//		// creacion de objetos de tipo Empleado
//		
//		//JefeEmpleado Empleado1 = new JefeEmpleado(); 
//		
//		Empleados Empleado1 = new JefeEmpleado();
//		
//		Empleados Empleado2= new SecretarioEmpleado();
//		
//		Empleados Empleado3= new DirectorEmpleado();
//		
//		
//		// Usos de los objetos creador
//		 
//		 System.out.println(Empleado1.getTareas());
//		 
//		 System.out.println(Empleado2.getTareas());
//		 
//		 System.out.println(Empleado3.getTareas());

	}

}

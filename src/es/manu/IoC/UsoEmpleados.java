package es.manu.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {


		// pasos para Utilizar contenedor de Spring

		// 1 crear un contexto.

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("appicationContext.xml");

		// 2 pedir el Bean

		Empleado manu = contexto.getBean("miEmpleado", Empleado.class);

		// 3 usar el objeto Bean

		System.out.println(manu.getTareas());
		
		System.out.println(manu.getInforme());
		
		
		
		Empleado jefeEmpleado = contexto.getBean("miJefeEmpleado", Empleado.class);
		
		System.out.println(jefeEmpleado.getInforme());

		// 4 Cerrar el contexto

		contexto.close();


	}

}







/*
 * JefeEmpleado empleado1 = new JefeEmpleado();
 * 
 * System.out.println(empleado1.GetTareas());
 * 
 * 
 * Empleado empleado2 = new JefeEmpleado();
 * 
 * System.out.println(empleado2.GetTareas());
 * 
 * 
 * Empleado empleado3 = new Secretario();
 * 
 * System.out.println(empleado3.GetTareas());
 * 
 * 
 * Secretario empleado4 = new Secretario();
 * 
 * System.out.println(empleado4.GetTareas());
 * 
 * System.out.println(empleado4.Getpagos());
 * 
 * Empleado empleado5 = new Secretario();
 * 
 * System.out.println(empleado5.GetTareas());
 */

// ****************************************************************
//
//		Secretario secre = contexto.getBean("miSecretario", Secretario.class);
//
//		System.out.println(secre.Getpagos());
//
//		System.out.println(secre.GetTareas());
//		
//		
//		Empleado secre1 = contexto.getBean("miSecretario", Secretario.class);
//		
//		System.out.println("solo hacer tareas secretario y "+ secre1.GetTareas() +   secre1.getInforme());
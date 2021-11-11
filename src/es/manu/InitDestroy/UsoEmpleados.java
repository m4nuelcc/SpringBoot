package es.manu.InitDestroy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {

// **********************UTILIZANDO SPRING***************************

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("appicationContextInitDestroy.xml");

		DirectorEmpleado Manu = contexto.getBean("miEmpleado", DirectorEmpleado.class);

		System.out.println(Manu.getTareas());
		
		System.out.println(Manu.getInforme());


		contexto.close();
		
		


	}

}

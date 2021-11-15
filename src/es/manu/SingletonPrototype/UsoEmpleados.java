package es.manu.SingletonPrototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {

// **********************UTILIZANDO SPRING***************************

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("appicationContextSingletonPrototype.xml");

		// PETICION DE LOS BEANS AL CONTENERDOR

		SecretarioEmpleado Manu = contexto.getBean("miSecretario", SecretarioEmpleado.class);
		
		SecretarioEmpleado Renee = contexto.getBean("miSecretario", SecretarioEmpleado.class);
		
		
		System.out.println("al ser SINGLETON nos devuelve la misma direccion de memoria");
		System.out.println(Manu);
		System.out.println(Renee);
		
		if (Manu==Renee) System.out.println("tienen la misma direccion de memoria");
		
		else System.out.println("no se trata del mismo objeto, si queremos que sea singleto, tenemos que qutar scope='prototype' en el xml");


		contexto.close();

	}

}

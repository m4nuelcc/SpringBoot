package es.manu.InitDestroy;

public class DirectorEmpleado implements Empleados {

	// CREACION DE CAMPO TIPO CREACIONINFORME (INTERFAZ)

	private CreacionInformes informeNuevo;

	// CREACION DE CONSTRUCTOR QUE INYECTA LA DEPENDENCIA

	public DirectorEmpleado(CreacionInformes informeNuevo) {

		this.informeNuevo = informeNuevo;

	};

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "DirectorEmpleado hace sus tareas. ";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Este informe lo ha creado DIRECTOREMPLEADO " + informeNuevo.getInforme();
	}

	// metodo init Ejecutar tareas antes que el bean este disponible

	public void metodoInicial() {

		System.out.println("Dentro del metodo init. Aqui irian las tareas a ejecutar antes de que el ben este listo");

	}

	// metodo destroy. Ejecutar tareas despues de que el bean haya sido utilizado
	
	
	public void metodoFinal() {

		System.out.println("Dentro del metodo destroy. Aqui irian las tareas a ejecutar despues de utilizar el bean" );

	}

}

//VIDEO 09 16:16
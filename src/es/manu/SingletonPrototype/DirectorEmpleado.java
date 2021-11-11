package es.manu.SingletonPrototype;

public class DirectorEmpleado implements Empleados {
	
	//CREACION DE CAMPO TIPO CREACIONINFORME (INTERFAZ)
	
	private CreacionInformes informeNuevo;
	
	//CREACION DE CONSTRUCTOR QUE INYECTA LA DEPENDENCIA
	
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo=informeNuevo;
		
	};

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "DirectorEmpleado hace sus tareas. ";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Este informe lo ha creado DIRECTOREMPLEADO "+ informeNuevo.getInforme();
	}


}


//VIDEO 09 16:16
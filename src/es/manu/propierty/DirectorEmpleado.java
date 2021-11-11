package es.manu.propierty;

public class DirectorEmpleado implements Empleados {
	
	private String nombreEmpresa;
	
	private String email;
	
	
	//CREACION DE CAMPO TIPO CREACIONINFORME (INTERFAZ)
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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
package es.manu.propierty;

public class SecretarioEmpleado implements Empleados {
	
	private String nombreEmpresa;
	
	private String email;
	
	private CreacionInformes informeNuevo;
	
	
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

	public CreacionInformes getInformeNuevo() {
		return informeNuevo;
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		
		return "SecretarioEmpleado hace sus tareas. ";
	}

	@Override
	public String getInforme() {
		
		return "Este informe lo ha creado SECRETARIOEMPLEADO " + informeNuevo.getInforme();
	}
	


}

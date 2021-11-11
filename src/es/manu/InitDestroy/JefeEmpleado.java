package es.manu.InitDestroy;

public class JefeEmpleado  implements Empleados{
	
	private String nombreEmpresa;
	
	private String email;
	
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

	private CreacionInformes informeNuevo;
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		
		return"JefeEmpleado realiza sus tareas";
	}

	@Override
	public String getInforme() {
		
		return "Este informe lo ha creado JEFEMPLEADO " + informeNuevo.getInforme();
	}


}

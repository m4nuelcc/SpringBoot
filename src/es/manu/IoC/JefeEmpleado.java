package es.manu.IoC;

public class JefeEmpleado implements Empleado {
	
	private CreacionInformes creacionInformes;
	
	
	
	public JefeEmpleado(CreacionInformes creacionInformes) {
		
		this.creacionInformes = creacionInformes;
	}

	public String getTareas() {
		
		return "JefeEmpleado: hace las cositas de JefeEmpleado";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Este es el informe de JefeEmpleado " + creacionInformes.creacionInforme();
	}

}

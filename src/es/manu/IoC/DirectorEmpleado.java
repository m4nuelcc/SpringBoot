package es.manu.IoC;

public class DirectorEmpleado implements Empleado {

	// Creacion de campo tipo CreacionInforme (interfaz)

	private CreacionInformes InformeNuevo;

	// creacion del constructor que inyecta la dependencia

	public DirectorEmpleado(CreacionInformes informeNuevo) {

		this.InformeNuevo = informeNuevo;

	};

	@Override
	public String getTareas() {

		return "DirectorEmpleado: Hace las movidas de DirectorEmpleado";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Este es el informe de DirectorEmpleado " + InformeNuevo.creacionInforme();
	}

}

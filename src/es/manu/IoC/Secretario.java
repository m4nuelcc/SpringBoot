package es.manu.IoC;

public class Secretario implements Empleado {

	public String getTareas() {

		return " Secretario: Hago mis movidas de secretario ";
	}

	public String getpagos() {

		return "Secretario: hago mis pagos de secretatio ";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Este es el informe de secretario: ";
	}
}

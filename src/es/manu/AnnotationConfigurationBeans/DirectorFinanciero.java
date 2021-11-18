package es.manu.AnnotationConfigurationBeans;

public class DirectorFinanciero implements Empleados {

	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {

		this.informeFinanciero = informeFinanciero;
	}
	
	@Override
	public String getTaareas() {
		// TODO Auto-generated method stub
		return "Tareas de Director Financiero";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "DIRECTOR FINANCIERO: "+informeFinanciero.getInformeFinanciero();
	}

	private CreacionInformeFinanciero informeFinanciero;

}

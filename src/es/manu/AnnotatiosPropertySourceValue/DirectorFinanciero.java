package es.manu.AnnotatiosPropertySourceValue;

import org.springframework.beans.factory.annotation.Value;

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
	
	@Value("${email}")
	private String email;
	
	@Value("${nombreEmpresa}")
	private String nobreEmpresa;

	public String getEmail() {
		return email;
	}

	public String getNobreEmpresa() {
		return nobreEmpresa;
	}
	
	
	

	
}

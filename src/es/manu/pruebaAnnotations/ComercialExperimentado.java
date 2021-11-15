package es.manu.pruebaAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("comercialExperimentado")
public class ComercialExperimentado implements Empleados {
	
	private CreacionInformeFinanciero informeNuevo;
	
	
	@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero informeNuevo) {
		
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTaareas() {
		// TODO Auto-generated method stub
		return "vender y vender y maaas vender";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "COMERCIAL EXPERIMENTADO crea un informe de " + informeNuevo.getInformeFinanciero();
	}

}

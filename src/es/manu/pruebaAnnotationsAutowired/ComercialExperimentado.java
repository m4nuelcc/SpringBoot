package es.manu.pruebaAnnotationsAutowired;

/*tambien se puede poner el Autowired en con Setter o en un
 campo de clase segun nos interese o en un metodo normal

EJEMPLOS

@Autowired
public void setInformeNuevo(CreacionInformeFinanciero informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
@Autowire
private CreacionInformeFinanciero informeNuevo;
	
}*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("comercialExperimentado")
public class ComercialExperimentado implements Empleados {

	private CreacionInformeFinanciero informeNuevo;

	@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero informeNuevo) {

		this.informeNuevo = informeNuevo;
	}
	

	public void setInformeNuevo(CreacionInformeFinanciero informeNuevo) {
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
		return "COMERCIAL EXPERIMENTADO crea un informe de  y ademas crea una " + informeNuevo.getInformeFinanciero();
	}

}

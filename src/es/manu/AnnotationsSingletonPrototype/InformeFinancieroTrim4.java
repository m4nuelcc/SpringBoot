package es.manu.AnnotationsSingletonPrototype;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Informe Financiero Fin de A�O";
	}

}

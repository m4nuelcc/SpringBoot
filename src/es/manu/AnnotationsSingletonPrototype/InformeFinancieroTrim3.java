package es.manu.AnnotationsSingletonPrototype;

import org.springframework.stereotype.Component;



@Component
public class InformeFinancieroTrim3 implements CreacionInformeFinanciero{

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Informe Financiero tercer Trimestre";
	}

}

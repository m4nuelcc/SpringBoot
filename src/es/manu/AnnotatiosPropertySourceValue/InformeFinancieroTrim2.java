package es.manu.AnnotatiosPropertySourceValue;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Infomrme Financiero Trimestre2";
	}

}

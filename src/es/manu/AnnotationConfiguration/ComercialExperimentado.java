package es.manu.AnnotationConfiguration;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("comercialExperimentado")
//@Scope("prototype")
public class ComercialExperimentado implements Empleados, InitializingBean, DisposableBean {



	@Autowired
	@Qualifier("informeFinancieroTrim3")
	private CreacionInformeFinanciero informeNuevo;

//	@Autowired
//	@Qualifier("informeFinancieroTrim1")
// Tambien se puede poner en el setter	
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

	
	// EN LA VERSION 16 DE JAVA ESTOY UTILIZANDO ESTOS METODOS EN LUGAR DE @PostConstruct Y @PreDestroy
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Ejecutado tras creacion de bean");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Ejecutado antes de la destruccion del bean");
		
	}

}
//*******************ESTO APARTIR DE LA VERSION 9 DE JAVA NO SE PUEDE UTILIZAR-----------------------------------------------


/* ejecucion del codigo despues de creacion del bean


//@PostConstruct
public void ejecutaDespuesCreacion() {

	System.out.println("Ejecutado tras creacion de bean");
}

// Ejecucion de codigo despues de apagago de contenedor spring

//@PreDestroy
public void ejecutaAndresDestruccion() {

	System.out.println("Ejecutado antes de la destruccion del bean");
}*/

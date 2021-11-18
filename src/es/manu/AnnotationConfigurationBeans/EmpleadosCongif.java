package es.manu.AnnotationConfigurationBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("es.manu.AnnotationConfigurationBeans")
public class EmpleadosCongif {
	
	// definir el bean InformeficnancieroDtoCompras
	
	@Bean
	
	public CreacionInformeFinanciero informeFinancieroDtoComprasss() { //sera la ide del bean inyectado
	
		
		return new InformeFinancieroDtoCompras();
	}

	// definir el bean DirectorFinanciereo e inyuectar dependencias
	
	@Bean
	
	public Empleados directorFinancieroO() {
		
		
		return new DirectorFinanciero(informeFinancieroDtoComprasss());
	}
}

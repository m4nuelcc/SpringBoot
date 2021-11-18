package es.manu.AnnotatiosPropertySourceValue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.manu.AnnotatiosPropertySourceValue")
@PropertySource("classpath:datosEmpresa.propiedades") //cagar datos del fichero propedades
public class EmpleadosConfig {
	
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

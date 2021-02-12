/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_boot.json_processor.mutli_layer_tech.system_configuration.h2;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Miroslav
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory",
	basePackages = {"spring_boot.json_processor.mutli_layer_tech.d_dao.h2Repository.daoInterfaces"})
public class H2DataSourceConfig {

	@Primary
	@Bean("bean_h2_datasource")
	@ConfigurationProperties(prefix = "spring.h2.datasource")
	public DataSource getdatasource_H2() {
		return DataSourceBuilder.create().build();
	}
        
	@Primary
	@Bean("bean_h2_localContainerEntityManagerFactoryBean")
	public LocalContainerEntityManagerFactoryBean getEntityManagerFactoryBean_H2(
		EntityManagerFactoryBuilder builder_entityManagerFactory,
		@Qualifier("bean_h2_datasource") DataSource h2_Datasource) {
                
		//Map<String,Object> map_properties = new HashMap<>();
		
		return builder_entityManagerFactory
			.dataSource(h2_Datasource)
			.packages("spring_boot.json_processor.mutli_layer_tech.model")
			.persistenceUnit("CVE_Item")
			.build();

	}

	@Primary
	@Bean("bean_h2_transactionManagement")
	public PlatformTransactionManager getTransactionManagement_H2(
	       @Qualifier("bean_h2_localContainerEntityManagerFactoryBean") EntityManagerFactory emFactory){
	    return new JpaTransactionManager(emFactory);
	}

}

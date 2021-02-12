/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_boot.json_processor.mutli_layer_tech.system_configuration.postgres;


import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Miroslav
 */
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories
//	(entityManagerFactoryRef="entityManagerFactory",
//		basePackages=
//			{"spring_boot.json_processor.mutli_layer_tech.d_dao.postgresRepository.daoInterface"})
public class PostgresDataSourceConfig {

//       @ConfigurationProperties(prefix="datasource.postgres")
//       public DataSource getDatasource(){
//	      return DataSourceBuilder.create().build();
//       }
}

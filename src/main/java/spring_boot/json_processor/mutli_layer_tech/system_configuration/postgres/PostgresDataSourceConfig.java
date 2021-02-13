/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_boot.json_processor.mutli_layer_tech.system_configuration.postgres;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
@EnableJpaRepositories(entityManagerFactoryRef = "postgres_entityManagerFactory",
	basePackages
	= {"spring_boot.json_processor.mutli_layer_tech.d_dao.postgresRepository.daoInterface"},
	transactionManagerRef="bean_postgres_transationManagement")
public class PostgresDataSourceConfig {

	@Bean("bean_postgres_datasource")
	@ConfigurationProperties(prefix = "spring.postgres.datasource")
	public DataSource getDatasource_Postgres() {
		return DataSourceBuilder.create().build();
	}

	@Bean("postgres_entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean getEntityManagerFactory_Postgres(
		EntityManagerFactoryBuilder entityMangerBuilder,
		@Qualifier("bean_postgres_datasource") DataSource postgresDatasource) {

		return entityMangerBuilder.dataSource(postgresDatasource)
			.packages("spring_boot.json_processor.mutli_layer_tech.model")
			.persistenceUnit("CVE_Item")
			.build();
	}

	@Bean("bean_postgres_transationManagement")
	public PlatformTransactionManager getTransactionManagement_Postgres(
		@Qualifier("postgres_entityManagerFactory")
			EntityManagerFactory entityManager) {
                return new JpaTransactionManager(entityManager);
	}
}

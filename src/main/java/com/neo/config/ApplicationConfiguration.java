package com.neo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.MultipartResolutionDelegate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan({"com.neo.controller", "com.neo.controller.forms", "com.neo.service"})
@SpringBootApplication
@EnableAutoConfiguration
public class ApplicationConfiguration {
	
	@Autowired
	DataSource dataSource;
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfiguration.class, args);
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setViewClass(JstlView.class);
		vr.setPrefix("/WEB-INF/jsp/");
		vr.setSuffix(".jsp");
		
		return vr;
	}
	
	
	
/*	@Bean
	public SessionFactory sessionFactory() {
		org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration()
		.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect")
		.setProperty("hibernate.show_sql", "true")
		.configure();
		
		SessionFactory sf = configuration
			    .buildSessionFactory(
			        new StandardServiceRegistryBuilder()
			            .applySettings(configuration.getProperties())
			            //here you apply the custom dataSource
			            .applySetting(Environment.DATASOURCE, dataSource)
			            .build());
		
		return sf;
	}
*/}

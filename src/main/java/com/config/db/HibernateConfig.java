//package com.config.db;
//
//import java.util.Properties;
//
//import javax.sql.DataSource;
// 
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.hibernate5.HibernateTransactionManager;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
// 
//@Configuration
//@EnableTransactionManagement
//@ComponentScan(basePackages="org.lopez.ebookstore")
//@PropertySource(value="classpath:application.properties")
//public class HibernateConfig {
//     
//    @Autowired
//    Environment environment;
// 
//    @Bean
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource());
//        sessionFactory.setPackagesToScan("org.lopez.ebookstore.model");
//        sessionFactory.setHibernateProperties(hibernateProperties());
//        return sessionFactory;
//    }
// 
//    private Properties hibernateProperties() {
//        Properties properties = new Properties();
////        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
////        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
////        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
//        return properties; 
//    }
// 
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//     //   dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root12345");
//        return dataSource;
//    }
//     
//    @Bean
//    @Autowired
//    public HibernateTransactionManager transactionManager(SessionFactory s) {
//        HibernateTransactionManager txManager = new HibernateTransactionManager();
//        txManager.setSessionFactory(s);
//        return txManager;
//    }
//}

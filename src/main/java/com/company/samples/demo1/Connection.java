package com.company.samples.demo1;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by levent on 03.02.2015.
 */
public class Connection {

    public DataSource createDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/customer");
        dataSource.setUsername("root");
        dataSource.setPassword("07010213");
        return dataSource;
    }
}

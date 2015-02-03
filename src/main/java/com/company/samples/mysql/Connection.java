package com.company.samples.mysql;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by levent on 03.02.2015.
 */
public class Connection {

    //create datasource(manually) for mysql
    public DataSource createDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/customer");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }

}
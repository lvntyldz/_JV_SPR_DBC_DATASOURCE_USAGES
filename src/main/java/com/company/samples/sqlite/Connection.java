package com.company.samples.sqlite;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by levent on 03.02.2015.
 */
public class Connection {

    //create datasource(manually) for sqlite
    public DataSource createDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.sqlite.JDBC");
        dataSource.setUrl("jdbc:sqlite:C:\\temp\\customer.db");
//        dataSource.setUsername("adm_lyildiz");
//        dataSource.setPassword("123456");
        return dataSource;
    }

}

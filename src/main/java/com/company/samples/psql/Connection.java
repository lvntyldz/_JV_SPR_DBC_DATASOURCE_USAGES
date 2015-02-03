package com.company.samples.psql;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by levent on 03.02.2015.
 */
public class Connection {

    //create datasource(manually) for postgresql
    public DataSource createDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://192.168.1.125:5432/customerdb?autoReconnect=true");
        dataSource.setUsername("adm_lyildiz");
        dataSource.setPassword("123456");
        return dataSource;
    }

}

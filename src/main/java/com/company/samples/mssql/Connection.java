package com.company.samples.mssql;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by levent on 03.02.2015.
 */
public class Connection {

    //create datasource(manually) for Microsoft SQL
    public DataSource createDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("net.sourceforge.jtds.jdbc.Driver");
        dataSource.setUrl("jdbc:jtds:sqlserver://192.168.1.75/CUSTOMER");
        dataSource.setUsername("usr_dev");
        dataSource.setPassword("dev11!-");
        return dataSource;
    }
}

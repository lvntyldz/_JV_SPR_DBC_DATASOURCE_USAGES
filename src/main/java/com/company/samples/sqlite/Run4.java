package com.company.samples.sqlite;


import javax.sql.DataSource;

/**
 * Created by levent on 03.02.2015.
 */
public class Run4 {

    public static void main(String[] args) throws Exception {
        Connection conn = new Connection();
        DataSource ds = conn.createDataSource();

        System.out.println("DataSource ::::: " + ds.getConnection());
    }

}

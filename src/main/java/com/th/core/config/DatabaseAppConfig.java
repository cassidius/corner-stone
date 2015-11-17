/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.th.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import javax.sql.DataSource;

/**
 * Handles some application configuration
 *
 * @author pwarrington
 */
@Configuration
public class DatabaseAppConfig {

    @Bean
    public DataSource longitudinalDataSource(){
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost:3306/th_data_collect");
        dataSource.setUser("custodian");
        dataSource.setPassword("lop4data!!");
        return dataSource;
    }
    @Bean(name = "longJdbcTemplate")
    public JdbcTemplate longitudinalJdbcTemplate() {
        
        JdbcTemplate template = new JdbcTemplate(longitudinalDataSource());
        return template;
    }

}

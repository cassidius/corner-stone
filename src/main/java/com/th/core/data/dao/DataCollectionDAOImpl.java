/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.th.core.data.dao;

import com.th.core.beans.LongitudinalDatum;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * Implementation of the data collection DAO
 *
 * @author pwarrington
 */
@Repository
public class DataCollectionDAOImpl implements DataCollectionDAO {

    @Autowired
    @Qualifier("longJdbcTemplate")
    private JdbcTemplate longJdbcTemplate;

    private static final String GET_DATA_QUERY = "SELECT id, datatype,value,datacollectionid,recordtime,appliesto,label FROM longitudinaldata WHERE recordtime > ?";

    /**
     * Gets a list of the longitudinal datum
     * @return
     */
    @Override
    public List<LongitudinalDatum> getData() {
        return longJdbcTemplate.query(
                GET_DATA_QUERY, new Object[]{new Date()},
                new RowMapper<LongitudinalDatum>() {
            @Override
            public LongitudinalDatum mapRow(ResultSet rs, int i) throws SQLException {
                LongitudinalDatum ld = new LongitudinalDatum();
                ld.setAppliesTo(rs.getInt("appliesto"));
                ld.setId(rs.getInt("id"));
                ld.setLabel(rs.getString("label"));
                ld.setRecordTime(rs.getDate("recordtime"));
                ld.setType(rs.getString("datatype"));
                ld.setValue(rs.getString("value"));
                return ld;
            }
        });
    }

}

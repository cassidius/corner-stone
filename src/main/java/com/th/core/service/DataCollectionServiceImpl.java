/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.th.core.service;

import com.th.core.beans.LongitudinalDatum;
import com.th.core.data.dao.DataCollectionDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Implementation for data collection services
 * @author pwarrington
 */
public class DataCollectionServiceImpl implements DataCollectionService{

    @Autowired
    private DataCollectionDAO dataCollectionDao;
    
    @Override
    public List<LongitudinalDatum> getData() {
        return dataCollectionDao.getData();
    }

}

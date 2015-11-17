/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.th.core.data.dao;

import com.th.core.beans.LongitudinalDatum;
import java.util.List;

/**
 * Interface for data access of the data collection
 * @author pwarrington
 */
public interface DataCollectionDAO {

    public List<LongitudinalDatum> getData();
}

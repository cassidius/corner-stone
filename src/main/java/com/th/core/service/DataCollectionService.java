/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.th.core.service;

import com.th.core.beans.LongitudinalDatum;
import java.util.List;

/**
 * Interface for data collection services
 * @author pwarrington
 */

public interface DataCollectionService {

    public List<LongitudinalDatum> getData();
}

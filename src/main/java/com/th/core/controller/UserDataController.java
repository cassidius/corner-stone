package com.th.core.controller;

import com.th.core.beans.LongitudinalDatum;
import com.th.core.service.DataCollectionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller which handles pulling user data from the data sources
 *
 * @author pwarrington
 */
@Controller
@RequestMapping("/v1")
public class UserDataController {

    @Autowired
    private DataCollectionService dataCollectionService;

    @RequestMapping(method = RequestMethod.GET, value = "/data")
    public @ResponseBody
    List<LongitudinalDatum> getData(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
        return dataCollectionService.getData();
    }
}

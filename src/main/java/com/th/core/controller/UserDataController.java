package com.th.core.controller;

import com.th.core.data.dto.UserLongitudinalDataPoint;
import java.util.Date;
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

    @RequestMapping(method = RequestMethod.GET, value = "/data")
    public @ResponseBody
    UserLongitudinalDataPoint getData(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
        UserLongitudinalDataPoint dp = new UserLongitudinalDataPoint();
        dp.setId(1);
        dp.setSourceDevice("glucoseMeter");
        dp.setSourceType("glucose");
        dp.setSourceUser("Self");
        dp.setSourceValue("14");
        dp.setPublishDate(new Date());
        return dp;
    }
}

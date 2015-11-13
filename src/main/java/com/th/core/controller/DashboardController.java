package com.th.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Dashboard Controller for people who have successfully accessed the siteuthenitcated
 * @author pwarrington
 */
@RestController
public class DashboardController {
    @RequestMapping("/dashboard")
    public String index() {
        return "<html><head></head><body><h1>Welcome to the dashboard!</h1></body></html>";
    }
}

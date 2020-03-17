package com.autotrader.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test-service")
    public String testService() {
        int pass = 0;
        int fail = 0;

        String result =  "Successfully invoked endpoint. Running tests: \n";

        // Add calls to different test functionality

        result += "Completed running tests. Passed: " + pass + " Failed: " + fail;

        return result;
    }
}

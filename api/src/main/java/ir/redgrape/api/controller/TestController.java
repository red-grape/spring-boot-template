package ir.redgrape.api.controller;

import ir.redgrape.model.*;
import ir.redgrape.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    private TestService testService;

    public TestController(TestService testService){
        this.testService = testService;
    }

    @GetMapping
    public TestResponse get(TestRequest req){
        return this.testService.getTest(req);
    }
}

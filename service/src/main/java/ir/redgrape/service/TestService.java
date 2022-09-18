package ir.redgrape.service;

import ir.redgrape.model.*;
import org.springframework.stereotype.Service;

@Service
public class TestService
{
    public TestResponse getTest(TestRequest value){
        TestResponse response = new TestResponse();
        response.setValue(value.getParam1() + "---" + value.getParam2());
        return response;
    }
}

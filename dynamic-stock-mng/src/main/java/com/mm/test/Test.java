package com.mm.test;

import io.sofastack.dynamic.facade.StrategyService;
import io.sofastack.dynamic.facade.TestClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping("/testSamePackage")
    public String testSamePackage(){
        String tests= StrategyService.TEST_STR;
        synchronized (StrategyService.TEST_STR){
            return "testSamePackage stock mng success"+tests;
        }
    }
    @GetMapping("/test")
    public int test(){
        return TestClass.getInstance().testAAA()+System.identityHashCode(TestClass.getInstance());
    }
    @GetMapping("/testObject")
    public String testObject(){
        int string=System.identityHashCode(StrategyService.TEST_STR);
        int stringNew=System.identityHashCode(StrategyService.TEST_STR_NEW);
        int object=System.identityHashCode(StrategyService.TEST_CLASS);
        return string+" "+stringNew+" "+object;
    }
}

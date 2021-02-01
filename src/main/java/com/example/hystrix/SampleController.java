package com.example.hystrix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 설명 :
 *
 * @author Minkuk Jo / mingood92@gmail.com
 * @since 2021. 01. 14
 */
@RestController
@RequestMapping("sample")
public class SampleController {

    private static int count = 1;

    @GetMapping("/server2")
    public String sample() {
        System.out.println("## hystrix server2 case1");
        return "Server2 Call Success";
    }

    @GetMapping("/server2-fallback")
    public String sampleFallback() {
        System.out.println("## [" + (count++) + "] hystrix server2 case2");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Server2 Call Success";
    }

}

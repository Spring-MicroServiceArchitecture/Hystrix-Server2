package com.example.hystrix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 설명 :
 *
 * @author Hardy(조민국) / mingood92@gmail.com
 * @since 2021. 01. 14
 */
@RestController
@RequestMapping("sample")
public class SampleController {

    @GetMapping("/server2")
    public String sample() {
        return "Server2 Call Success";
    }

    @GetMapping("/server2-fallback")
    public String sampleFallback() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Server2 Call Success";
    }

}


package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/sum")
    public int sum(@RequestParam int a,
                   @RequestParam int b) {
		float i =10.1f;
        string name ="aj";
        float a=10;

        return a + b;
    }
}

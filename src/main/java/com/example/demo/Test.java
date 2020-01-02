package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/test")
public class Test {
    @RequestMapping(value = "",method = RequestMethod.GET)
    public void print(HttpServletResponse response){
        try {
            response.getWriter().println("hell22222222");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

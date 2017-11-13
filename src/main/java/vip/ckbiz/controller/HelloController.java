package vip.ckbiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Ahn on 2017/11/13.
 */
@Controller
@RequestMapping(value = "/")
public class HelloController {

    @RequestMapping(value = "hello.do")
    public String home(HttpServletRequest request, ModelMap modelMap) {
        modelMap.addAttribute("ccccc", "aaa");
        return "home";
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Vip Project, Say Hello World");
    }

}

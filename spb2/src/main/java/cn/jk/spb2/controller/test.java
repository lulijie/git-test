package cn.jk.spb2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @RequestMapping("/quick")
    public String get() {
        int a =100;
        a++;
        a++;
        a--;
        return "hellooaaaaaaa";
    }
}

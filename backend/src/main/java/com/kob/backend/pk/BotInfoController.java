package com.kob.backend.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
    public String getBotInfo() {
        return "这是一个测试";
    }
    @RequestMapping("getbotinfo2/")
    public List<String> getBotInfo2() {
        List<String> res = new ArrayList<>();
        res.add("这是一条测试1");
        res.add("这是一条测试2");
        res.add("这是一条测试3");
        res.add("这是一条测试4");
        return res;
    }
    @RequestMapping("getbotinfo3/")
    public Map<String, String> getBotInfo3() {
        Map<String, String> res = new HashMap<>();
        res.put("这是一条测试", "1");
        return res;
    }
}

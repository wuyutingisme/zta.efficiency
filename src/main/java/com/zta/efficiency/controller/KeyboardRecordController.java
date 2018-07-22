package com.zta.efficiency.controller;

import com.zta.efficiency.model.KeyboardRecord;
import com.zta.efficiency.service.KeyboardRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/keyboardrecord")
public class KeyboardRecordController {
    @Autowired
    private KeyboardRecordService keyboardRecordService;

    @RequestMapping("/test")
    public String test(Model model){
        List<KeyboardRecord> kb = keyboardRecordService.testMybatis();
        model.addAttribute("KeyboardRecord",kb);
        return "/system/test";
    }

}

package com.zta.efficiency.service;

import com.zta.efficiency.dao.KeyboardRecordMapper;
import com.zta.efficiency.model.KeyboardRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("keyboardRecordService")
public class KeyboardRecordService {

    @Autowired
    private KeyboardRecordMapper keyboardRecordMapper;

    public List<KeyboardRecord> testMybatis(){
        return  keyboardRecordMapper.selectKeyboardRecord("zengxiaofang");
    }
}

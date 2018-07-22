package com.zta.efficiency.dao;

import com.zta.efficiency.model.KeyboardRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KeyboardRecordMapper {
    int insert(KeyboardRecord record);

    int insertSelective(KeyboardRecord record);


    List<KeyboardRecord> selectKeyboardRecord(@Param("username")String username);
}
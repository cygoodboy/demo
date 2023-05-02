package com.example.rabbitmqstudy.repository;

import com.example.rabbitmqstudy.model.AlarmRule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AlarmRuleMapper {

    /**
     * 根据规则类型查询告警规则信息
     *
     * @param ruleType 规则类型 1:5min均值 2:1H均值
     * @return 告警规则信息
     */
    List<AlarmRule> queryByRuleType(@Param("ruleType") Integer ruleType,
                                    @Param("typeId") Long typeId,
                                    @Param("categoryId") Long categoryId,
                                    @Param("metric") String metric);

}

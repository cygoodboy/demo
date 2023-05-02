package com.example.rabbitmqstudy.model;

import lombok.Data;

import java.util.Date;

/**
 * @author duhang
 * @version 1.0
 * @date 2023/3/17 18:33
 */
@Data
public class AlarmRule {

    private Long id;

    /**
     * 排口编号
     */
    private String emissionNo;

    /**
     * 排口名称
     */
    private String emissionName;

    /**
     * 设备细分类
     */
    private Long typeId;

    /**
     * 设备细分类名称
     */
    private String typeName;

    /**
     * 信号类型Id
     */
    private Long categoryId;

    /**
     * 类型
     */
    private String metric;

    /**
     * 阈值
     */
    private Double threshold;

    /**
     * 单位
     */
    private String unit;

    /**
     * 类型 1:5min均值 2:1h均值
     */
    private Integer ruleType;

    private Date createTime;

    private Date updateTime;

}

package com.wsl.example.enums;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @Author: wsl
 * @Since: 2024-5-6
 * @Version: 1.0
 * @Description: TODO
 */
@Getter
public enum OrderStatusEnum {
    NEW("NEW", "新建"),
    CANCEL("CANCEL", "取消"),
    PAY("PAY", "已支付");

    private String code;
    private String value;

    OrderStatusEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }


    public static String getValue(String code) {
        if(StringUtils.isBlank(code)){
            return null;
        } else {
            if(code.contains(",")) {
                String[] split = code.split(",");
                Arrays.stream(split).map(s -> {
                    for (OrderStatusEnum userTypeEnum : OrderStatusEnum.values()) {
                        if (userTypeEnum.getCode().equals(code)) {
                            return userTypeEnum.getValue();
                        }
                    }
                    return null;
                }).collect(Collectors.joining(","));
            } else {
                for (OrderStatusEnum userTypeEnum : OrderStatusEnum.values()) {
                    if (userTypeEnum.getCode().equals(code)) {
                        return userTypeEnum.getValue();
                    }
                }
            }
        }

        return null;
    }

    public static String getCode(String value) {
        for (OrderStatusEnum userTypeEnum : OrderStatusEnum.values()) {
            if (userTypeEnum.getValue().equals(value)) {
                return userTypeEnum.getCode();
            }
        }
        return null;
    }

}

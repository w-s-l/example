package com.wsl.example.enums;

import lombok.Getter;

/**
 * @Author: wsl
 * @Since: 2024-5-6
 * @Version: 1.0
 * @Description: TODO
 */
@Getter
public enum ColorEnum {
    RED("RED", "红色"),
    GREEN("GREEN", "绿色"),
    PINK("PINK", "粉色"),
    BLACK("BLACK", "黑色"),
    BLUE("BLUE", "蓝色");

    private String code;
    private String value;

    ColorEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }


    public static String getValue(String code) {
        for (ColorEnum userTypeEnum : ColorEnum.values()) {
            if (userTypeEnum.getCode().equals(code)) {
                return userTypeEnum.getValue();
            }
        }
        return null;

    }

    public static String getCode(String value) {
        for (ColorEnum userTypeEnum : ColorEnum.values()) {
            if (userTypeEnum.getValue().equals(value)) {
                return userTypeEnum.getCode();
            }
        }
        return null;
    }

}

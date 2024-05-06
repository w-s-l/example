package com.wsl.example.enums;

import lombok.Getter;

/**
 * @Author: wsl
 * @Since: 2024-5-6
 * @Version: 1.0
 * @Description: TODO
 */
@Getter
public enum PlateFromEnum {
    TB("TB", "淘宝"),
    DY("DY", "抖音");

    private String code;
    private String value;

    PlateFromEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }


    public static String getValue(String code) {
        for (PlateFromEnum userTypeEnum : PlateFromEnum.values()) {
            if (userTypeEnum.getCode().equals(code)) {
                return userTypeEnum.getValue();
            }
        }
        return null;
    }

    public static String getCode(String value) {
        for (PlateFromEnum userTypeEnum : PlateFromEnum.values()) {
            if (userTypeEnum.getValue().equals(value)) {
                return userTypeEnum.getCode();
            }
        }
        return null;
    }

}

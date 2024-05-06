package com.wsl.example.enums;

import lombok.Getter;

/**
 * @Author: wsl
 * @Since: 2024-5-6
 * @Version: 1.0
 * @Description: TODO
 */
@Getter
public enum SizeEnum {
    S("S", "S码"),
    M("M", "M码"),
    L("L", "L码"),
    XL("XL", "XL码"),
    XXL("XXL", "XXL码"),
    XXXL("XXXL", "XXXL码");

    private String code;
    private String value;

    SizeEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }


    public static String getValue(String code) {
        for (SizeEnum userTypeEnum : SizeEnum.values()) {
            if (userTypeEnum.getCode().equals(code)) {
                return userTypeEnum.getValue();
            }
        }
        return null;
    }

    public static String getCode(String value) {
        for (SizeEnum userTypeEnum : SizeEnum.values()) {
            if (userTypeEnum.getValue().equals(value)) {
                return userTypeEnum.getCode();
            }
        }
        return null;
    }

}

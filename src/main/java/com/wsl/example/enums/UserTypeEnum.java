package com.wsl.example.enums;

import lombok.Getter;

/**
 * @Author: wsl
 * @Since: 2024-5-6
 * @Version: 1.0
 * @Description: TODO
 */
@Getter
public enum UserTypeEnum {
    SELLER("SELLER", "卖家"),
    BUYER("BUYER", "买家");

    private String code;
    private String value;

    UserTypeEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }


    public static String getValue(String code) {
        for (UserTypeEnum userTypeEnum : UserTypeEnum.values()) {
            if (userTypeEnum.getCode().equals(code)) {
                return userTypeEnum.getValue();
            }
        }
        return null;
    }

    public static String getCode(String value) {
        for (UserTypeEnum userTypeEnum : UserTypeEnum.values()) {
            if (userTypeEnum.getValue().equals(value)) {
                return userTypeEnum.getCode();
            }
        }
        return null;
    }

}

package com.wsl.example.dto;

import com.wsl.example.enums.ColorEnum;
import com.wsl.example.enums.SizeEnum;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: wsl
 * @Since: 2024-5-6
 * @Version: 1.0
 * @Description: TODO
 */
@Data
public class OrderItemDTO {


    /**
     * 明细id
     */
    private Long id;

    /**
     * 商品id
     */
    private Long itemId;

    /**
     * 商品名称
     */
    private String title;


    /**
     * 颜色
     */
    private String color;
    /**
     * 颜色
     */
    private String colorName;

    /**
     * 尺码
     */
    private String size;

    /**
     * 尺码
     */
    private String sizeName;

    /**
     * sku
     */
    private String sku;

    /**
     * 店铺id
     */
    private Long shopId;
    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 总金额
     */
    private BigDecimal totalAmount;


    public String getColorName() {
        return ColorEnum.getValue(color);
    }
    public String getSizeName() {
        return SizeEnum.getValue(size);
    }

}

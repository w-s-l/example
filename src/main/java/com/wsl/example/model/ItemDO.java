package com.wsl.example.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author wsl
 * @since 2024-05-06
 */
@Getter
@Setter
@TableName("item")
@Schema(name = "ItemDO", description = "商品表")
public class ItemDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "主键")
      @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @Schema(description = "商品名称")
    @TableField("title")
    private String title;

    @Schema(description = "颜色 RED GREEN BLUE")
    @TableField("color")
    private String color;

    @Schema(description = "尺码 S M L XL XXL XXXL")
    @TableField("size")
    private String size;

    @Schema(description = "商品sku 例如：SKY-P0247M")
    @TableField("sku")
    private String sku;

    @Schema(description = "店铺id")
    @TableField("shop_id")
    private Long shopId;

    @Schema(description = "单价")
    @TableField("price")
    private BigDecimal price;

}

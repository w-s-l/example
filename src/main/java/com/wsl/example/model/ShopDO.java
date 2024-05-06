package com.wsl.example.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 店铺
 * </p>
 *
 * @author wsl
 * @since 2024-05-06
 */
@Getter
@Setter
@TableName("shop")
@Schema(name = "ShopDO", description = "店铺")
public class ShopDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "主键")
      @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @Schema(description = "店铺名称")
    @TableField("name")
    private String name;

    @Schema(description = "平台：TB->淘宝  DY->抖音")
    @TableField("plateform")
    private String plateform;
}

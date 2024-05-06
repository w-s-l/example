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
 * 订单明细
 * </p>
 *
 * @author wsl
 * @since 2024-05-06
 */
@Getter
@Setter
@TableName("order_item")
@Schema(name = "OrderItemDO", description = "订单明细")
public class OrderItemDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "主键")
      @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @Schema(description = "订单id")
    @TableField("oid")
    private Long oid;

    @Schema(description = "商品id")
    @TableField("item_id")
    private Long itemId;


    @Schema(description = "数量")
    @TableField("num")
    private Integer num;

    @Schema(description = "总价")
    @TableField("total_amount")
    private BigDecimal total_amount;
}

package com.wsl.example.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 订单
 * </p>
 *
 * @author wsl
 * @since 2024-05-06
 */
@Getter
@Setter
@TableName("order")
@Schema(name = "OrderDO", description = "订单")
public class OrderDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "主键")
      @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @Schema(description = "店铺id")
    @TableField("shop_id")
    private Long shopId;

    @Schema(description = "卖家id")
    @TableField("seller_id")
    private Long sellerId;

    @Schema(description = "买家id")
    @TableField("buyer_id")
    private Long buyerId;

    @Schema(description = "订单状态  NEW  CANCEL   PAY ")
    @TableField("status")
    private String status;


    @Schema(description = "支付总金额 ")
    @TableField("pay_amount")
    private BigDecimal payAmount;

    @Schema(description = "总数 ")
    @TableField("total_num")
    private Integer totalNum;

    @Schema(description = "创建时间 ")
    @TableField("create_time")
    private Date createTime;

}

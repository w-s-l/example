package com.wsl.example.dto;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wsl.example.enums.OrderStatusEnum;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: wsl
 * @Since: 2024-5-6
 * @Version: 1.0
 * @Description: TODO
 */
@Data
public class OrderDTO {

    /**
     * 订单id
     */
    private String id;


    /**
     * 订单编号
     */
    private String outTradeNo;


    /**
     * 店铺名称
     */
    private String shopName;


    /**
     * 买家名称
     */
    private String buyerName;

    /**
     * 卖家名称
     */
    private String sellerName;

    /**
     * 订单明细
     */
    private List<OrderItemDTO> itemDTOList;

    /**
     * 订单明细str
     */
    @JsonIgnore
    private String detailStr;

    /**
     * 支付金额
     */
    private BigDecimal payAmount;

    private Integer totalNum;


    /**
     * 订单状态
     */
    private String status;
    /**
     * 订单状态名称
     */
    private String statusName;


    public String getStatusName() {
        return OrderStatusEnum.getValue(status);
    }

    public List<OrderItemDTO> getItemDTOList() {
        if (StringUtils.isBlank(detailStr)){
            return new ArrayList<>();
        } else {
            return JSON.parseArray(detailStr, OrderItemDTO.class);
        }
    }

}

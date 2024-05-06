package com.wsl.example.service;

import com.wsl.example.dto.OrderDTO;
import com.wsl.example.request.OrderRequest;
import com.wsl.example.util.JsonData;

import java.util.List;

/**
 * @Author: wsl
 * @Since: 2024-5-6
 * @Version: 1.0
 * @Description: TODO
 */
public interface OrderService {


    /**
     * 订单查询
     * @param orderRequest
     * @return
     */
    List<OrderDTO> queryOrder(OrderRequest orderRequest);
}

package com.wsl.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wsl.example.dto.OrderDTO;
import com.wsl.example.mapper.OrderMapper;
import com.wsl.example.request.OrderRequest;
import com.wsl.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wsl
 * @Since: 2024-5-6
 * @Version: 1.0
 * @Description: TODO
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<OrderDTO> queryOrder(OrderRequest orderRequest) {
        Page<OrderDTO> page = new Page<>(orderRequest.getPage(), orderRequest.getSize());
        IPage<OrderDTO> orderDTOIPage = orderMapper.selectOrder(page, orderRequest);
        return orderDTOIPage.getRecords();
    }
}

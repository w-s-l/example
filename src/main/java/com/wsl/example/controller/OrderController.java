package com.wsl.example.controller;

import cn.hutool.json.serialize.JSONDeserializer;
import com.wsl.example.request.OrderRequest;
import com.wsl.example.service.OrderService;
import com.wsl.example.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wsl
 * @Since: 2024-5-6
 * @Version: 1.0
 * @Description: TODO
 */
@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/query")
    public JsonData queryOrder(@RequestBody OrderRequest orderRequest) {
        return JsonData.buildSuccess(orderService.queryOrder(orderRequest));
    }


}

package com.wsl.example.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wsl
 * @Since: 2024-5-6
 * @Version: 1.0
 * @Description: TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    /**
     *订单状态  NEW CANCEL  PAY
     */
    private String orderStatus;
    /**
     * 商店名称  模糊查询
     */
    private String shopName;

    /**
     * 商品数量筛选前界限
     */
    private Integer itemNumStart;

    /**
     * 商品数量筛选后界限
     */
    private Integer itemNumEnd;


    /**
     * 排序字段  totalNum 默认不排序
     */
    private String sortField;
    /**
     * 排序类型  desc  asc
     */
    private String sortType = "asc";


    /**
     * 分组字段  默认订单分组   可传  'name' 进行店铺分组
     */
    private String groupField;


    /**
     * 第几页
     */
    private Integer page = 1;


    /**
     * 每页条数
     */
    private Integer size = 10;
}



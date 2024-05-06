package com.wsl.example.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wsl.example.dto.OrderDTO;
import com.wsl.example.model.OrderDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wsl.example.request.OrderRequest;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 订单 Mapper 接口
 * </p>
 *
 * @author wsl
 * @since 2024-05-06
 */
public interface OrderMapper extends BaseMapper<OrderDO> {

    IPage<OrderDTO> selectOrder(@Param("page") Page<OrderDTO> page, @Param("param") OrderRequest param);
}

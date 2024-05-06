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
 * 用户表
 * </p>
 *
 * @author wsl
 * @since 2024-05-06
 */
@Getter
@Setter
@TableName("user")
@Schema(name = "UserDO", description = "用户表")
public class UserDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "主键")
      @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @Schema(description = "昵称")
    @TableField("nickname")
    private String nickname;

    @Schema(description = "用户类型  SELLER 卖家    BUYER买家")
    @TableField("type")
    private String type;
}

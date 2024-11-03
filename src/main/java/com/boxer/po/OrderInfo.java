package com.boxer.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@TableName(value = "t_order")
public class OrderInfo {
    @TableId(type = IdType.AUTO) // 指定主键策略为自增
    private Long id;
    private Long buyerId;
    private BigDecimal totalAmt;

    private LocalDateTime orderDate;
    private Integer status;
    private Boolean isDeleted;

}

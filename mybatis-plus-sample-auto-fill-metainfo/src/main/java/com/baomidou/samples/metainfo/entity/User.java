package com.baomidou.samples.metainfo.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户实体
 * @author nieqiurong 2018-08-10 22:55:21.
 */
@Data
@TableName(value = "public.user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @TableField("age")
    private Integer age;

    @TableField("email")
    private String email;
    
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String operator0;
}

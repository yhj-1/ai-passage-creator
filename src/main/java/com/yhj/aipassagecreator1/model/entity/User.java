package com.yhj.aipassagecreator1.model.entity;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import com.mybatisflex.core.keygen.KeyGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
/*
 * 用户
 */
@Data
@Builder//构建者模式
@NoArgsConstructor
@AllArgsConstructor
/*
ORM 框架注解。声明这个实体类对应数据库中的哪张表。
value：数据库表名
camelToUnderline：是否将驼峰命名法转换为下划线命名法;
Java 里的属性 userAccount，在数据库表里的字段名也是 userAccount
 */

@Table(value = "user", camelToUnderline = false)
public class User implements Serializable {

    //这是 JDK 14 引入的标记注解，用来明确表示 serialVersionUID 是与
    // Java 序列化机制相关的字段，帮助编译器进行检查。
    // serialVersionUID 用于在反序列化时验证类的版本是否一致。
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * id（使用雪花算法生成）
     */
    //声明 id 字段是这张表的主键。
    //keyType：主键类型，Generator 表示生成策略为“生成器模式”
    @Id(keyType = KeyType.Generator, value = KeyGenerators.snowFlakeId)
    private Long id;

    private String userAccount;
    private String userPassword;
    private String userName;
    private String userAvatar;
    private String userProfile;
    private String userRole;
    private LocalDateTime editTime;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    /**
     * 逻辑删除;在数据库上并非真正删除的
     */
    @Column(isLogicDelete = true)
    private Integer isDelete;
}

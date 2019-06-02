package com.studyhuang.house.entity.db;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author huang1996
 * @date 2019/6/2 11:26 AM
 */
@Data
@Accessors(chain = true)
@Table(name = "user")
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //用户唯一id,
    private String name; //用户名,
    private String email; //电子邮箱,
    @Column(name = "phone_number")
    private String phoneNumber; //电话号码,
    private String password; //密码,
    private Integer status; //用户状态 0-正常 1-封禁,
    @Column(name = "create_time", updatable = false)
    private Date createTime; //用户账号创建时间,
    @Column(name = "last_login_time")
    private Date lastLoginTime; //上次登录时间,
    @Column(name = "last_update_time")
    private Date lastUpdateTime; //上次更新记录时间,
    //头像
    private String avatar;
}

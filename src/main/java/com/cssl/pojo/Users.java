package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @program: ZProj
 * @Date: 2019/6/11 16:52
 * @Author: Mr.Deng
 * @Description:
 */
@Getter
@Setter
public class Users {
 private int uid;
 private String uname;
 private String password;
 private Date borddate;

}

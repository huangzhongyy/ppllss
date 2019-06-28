package com.cssl.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @program: ZProj
 * @Date: 2019/6/11 16:54
 * @Author: Mr.Deng
 * @Description:
 */
@Getter
@Setter
public class uservo {

 private int uid;
 private String uname;
 private String password;
 private Date borddate;
}

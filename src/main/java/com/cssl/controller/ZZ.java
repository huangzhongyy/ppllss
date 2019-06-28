package com.cssl.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cssl.pojo.Users;
import com.cssl.service.Userservice;
import com.cssl.vo.uservo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: ZProj
 * @Date: 2019/6/11 16:52
 * @Author: Mr.Deng
 * @Description:
 */

@Controller
public class ZZ {

 @Autowired
 private Userservice userservice;

 @RequestMapping("regis/{id}/{aa}")
 public String rmo(uservo uvo){
  Users uu=new Users();
  BeanUtils.copyProperties(uvo,uu);
  List<Users> list=userservice.list(new QueryWrapper<Users>());//查询全部的方法
  for (Users s:list){
   System.out.println("wawa"+s.getUname());
  }
  userservice.save(uu);//save直接调用新增的方法
  return "index.html";
 }

 @RequestMapping("aa")
 public String sc(){
return "";
 }



}

package com.cssl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @program: ZProj
 * @Date: 2019/5/27 18:45
 * @Author: Mr.Deng
 * @Description:
 */
@MapperScan("com.cssl.dao")
@SpringBootApplication //入口
public class AAApp extends SpringBootServletInitializer {
 @Override
 protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
  return builder.sources(AAApp.class);
 }
/* public static void main(String[] args) {
  SpringApplication.run(AAApp.class,args);

 }*/
}

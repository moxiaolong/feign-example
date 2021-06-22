package com.example.consumer.controller;


import demo.feign.UserFeign;
import demo.feign.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * (User)表控制层
 *
 * @author makejava
 */
@RestController
@RequestMapping("user")
public class UserController {

  @Autowired
  UserFeign userFeign;

  /**
   * 通过主键查询单条数据
   *
   * @param id 主键
   * @return 单条数据
   */
  @GetMapping("queryById")
  public User selectOne(Integer id) {
    return userFeign.selectOne(id);
  }


}

package com.example.provider.controller;

import com.example.provider.entity.User;
import com.example.provider.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 */
@RestController
@RequestMapping("user")
public class UserController {
  /**
   * 服务对象
   */
  @Resource
  private UserService userService;

  /**
   * 注册用户
   */
  @PostMapping("insert")
  public User insert(@RequestBody User user) {
    return userService.insert(user);
  }

  /**
   * 更新用户信息
   */
  @PutMapping("/update")
  public User update(@RequestBody User user) {
    return this.userService.update(user);
  }

  /**
   * 通过主键查询单条数据
   *
   * @param id 主键
   * @return 单条数据
   */
  @GetMapping("queryById")
  public User selectOne(Integer id) {
    return this.userService.queryById(id);
  }


}

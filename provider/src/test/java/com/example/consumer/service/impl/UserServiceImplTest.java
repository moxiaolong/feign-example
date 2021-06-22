package com.example.consumer.service.impl;

import com.example.provider.entity.User;
import com.example.provider.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**

 *
 * @author Dragon
 */
@SpringBootTest
@Slf4j
class UserServiceImplTest {

  @Resource
  UserService userService;

  @Test
  void queryById() {
    User user = userService.queryById(1);
    log.info(user.getUsername());
  }

  @Test
  void insert() {
    User user = new User();
    user.setAge(10);
    user.setRealName("张三");
    user.setUsername("tom");
    user.setAccount(100);
    User insert = userService.insert(user);
    log.info(insert.getId().toString());
  }

  @Test
  void update() {
    User user = new User();
    user.setId(1);
    user.setAge(10);
    user.setRealName("李四");
    user.setUsername("jerry");
    User update = userService.update(user);
    log.info(update.getUsername());
  }
}
package com.example.provider.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 */
public class User implements Serializable {
  private static final long serialVersionUID = -99413615318043454L;

  private Integer id;
  /**
   * 用户名
   */
  private String username;
  /**
   * 用户年龄
   */
  private Integer age;
  /**
   * 真实姓名
   */
  private String realName;
  /**
   * 账号
   */
  private Integer account;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }

  public Integer getAccount() {
    return account;
  }

  public void setAccount(Integer account) {
    this.account = account;
  }

}

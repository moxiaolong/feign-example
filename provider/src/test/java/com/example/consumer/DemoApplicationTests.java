package com.example.consumer;

import com.example.provider.DemoApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DemoApplication.class)
class DemoApplicationTests {

  @Test
  void contextLoads() {
    System.out.println("hi");
  }

}

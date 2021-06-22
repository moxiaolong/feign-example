package demo.feign;

import demo.feign.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Dragon
 */
@FeignClient("user-service")
@RequestMapping("user")
public interface UserFeign {
  /**
   * 通过主键查询单条数据
   *
   * @param id 主键
   * @return 单条数据
   */
  @GetMapping("queryById")
  User selectOne(@RequestParam("id") Integer id);

}

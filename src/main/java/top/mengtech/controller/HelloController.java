package top.mengtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.mengtech.properties.GirlProperties;

/**
 * Created by mqm on 2017/5/2.
 */
@RestController("helloController")
@RequestMapping(value = "/hello")
public class HelloController {
  @Autowired
  private GirlProperties girlProperties;

  @RequestMapping(value = {"/hello","hi"},method = RequestMethod.GET)
  public String say(){
      return "index";
  }
}

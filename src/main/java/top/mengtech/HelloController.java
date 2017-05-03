package top.mengtech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by mqm on 2017/5/2.
 */
@RestController
public class HelloController {
  @Autowired
  private GirlProperties girlProperties;

  @RequestMapping(value = {"/hello","hi"},method = RequestMethod.GET)
  public String say(){
      return "index";
  }
}

package top.mengtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.mengtech.domain.Girl;
import top.mengtech.repository.GirlRepository;
import top.mengtech.service.GirlService;

import java.util.List;

/**
 * Created by mqm on 2017/5/3.
 */
@RestController("girlController")
@RequestMapping(value = "/girl")
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    GirlService girlService;
    /**
     * 查询女生列表
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }

    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                              @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);

        return girlRepository.save(girl);
    }

    /**
     * 查询
     * @return
     */
    @GetMapping(value = "/girls/{id}")
    public Girl girlList(@PathVariable("id") Integer id) {
        return girlRepository.findOne(id);
    }

    /**
     * 更新
     * @return
     */
    @PutMapping(value = "/girls/{id}")
    public Girl girlList(@PathVariable("id") Integer id,
                         @RequestParam("cupSize") String cupSize,
                         @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    /**
     * 删除
     * @return
     */
    @DeleteMapping(value = "/girls/{id}")
    public void girDelete(@PathVariable("id") Integer id) {
        girlRepository.delete(id);
    }

    /**
     * 根据年龄获取
     * @return
     */
    @GetMapping(value = "/girlsByAge/{age}")
    public List<Girl> girlsByAge(@PathVariable("age") Integer age) {
      return girlRepository.findByAge(age);
    }

    @PostMapping(value = "/two")
    public String two(){
        girlService.twoGirl();
        return "save success";
    }
}

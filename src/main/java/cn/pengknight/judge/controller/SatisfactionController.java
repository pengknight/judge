package cn.pengknight.judge.controller;


import cn.pengknight.judge.entity.MyResponseEntity;
import cn.pengknight.judge.entity.SatisfactionEntity;
import cn.pengknight.judge.repository.SatisfactionRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SatisfactionController {

    @Resource
    SatisfactionRepository satisfactionRepository;

    @PostMapping("/judge")
    public MyResponseEntity judge(@RequestBody SatisfactionEntity satisfactionEntity){
        MyResponseEntity myResponseEntity=new MyResponseEntity();
        //检查数据是否合法
        if (satisfactionEntity!=null){
            satisfactionRepository.save(satisfactionEntity);
            myResponseEntity.setErrcode(0);
            myResponseEntity.setErrmsg("ok");
        }else {
            myResponseEntity.setErrcode(1);
            myResponseEntity.setErrmsg("error");
        }
        return myResponseEntity;
    }
}
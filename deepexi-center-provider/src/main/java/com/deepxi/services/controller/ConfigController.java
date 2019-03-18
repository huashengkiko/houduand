package com.deepxi.services.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepxi.services.service.ConfigService;
import com.deepxi.services.domain.eo.Config;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/config", description = "$desc")
@RestController
@RequestMapping("/api/v1/configs")
public class  ConfigController {

    @Autowired
    private ConfigService configService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(Config eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(configService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(Config eo) {
        return new Payload(configService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) Integer  pk) {
        return new Payload(configService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改Config")
    public Payload update(@PathVariable(value = "id", required = true) Integer  pk, @RequestBody Config eo) {
     eo.setId(pk);
     return new Payload(configService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建Config", notes = "创建Config")
    public Payload create(@RequestBody Config eo) {
        return new Payload(configService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除Config", notes = "根据id删除Config")
    public Payload delete(@PathVariable(value = "id", required = true) Integer  pk) {
        return new Payload(configService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除Config", notes = "根据id批量删除Config")
    public Payload delete(@RequestParam(required = true) Integer [] ids) {
        return new Payload(configService.delete(ids));
    }

}
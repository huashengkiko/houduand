package com.deepxi.services.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepxi.services.service.SsService;
import com.deepxi.services.domain.eo.Ss;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/www.ss", description = "$desc")
@RestController
@RequestMapping("/api/v1/sss")
public class  SsController {

    @Autowired
    private SsService ssService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(Ss eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(ssService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(Ss eo) {
        return new Payload(ssService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) Integer  pk) {
        return new Payload(ssService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改Ss")
    public Payload update(@PathVariable(value = "id", required = true) Integer  pk, @RequestBody Ss eo) {
     eo.setId(pk);
     return new Payload(ssService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建Ss", notes = "创建Ss")
    public Payload create(@RequestBody Ss eo) {
        return new Payload(ssService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除Ss", notes = "根据id删除Ss")
    public Payload delete(@PathVariable(value = "id", required = true) Integer  pk) {
        return new Payload(ssService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除Ss", notes = "根据id批量删除Ss")
    public Payload delete(@RequestParam(required = true) Integer [] ids) {
        return new Payload(ssService.delete(ids));
    }

}
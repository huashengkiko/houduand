package com.deepxi.services.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepxi.services.domain.eo.Config;
import com.deepxi.services.service.ConfigService;
import com.deepxi.services.mapper.ConfigMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class ConfigServiceImpl implements ConfigService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ConfigMapper configMapper;

    @Override
    public PageBean<Config> findPage(Config eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<Config> pages =  configMapper.findList(eo);
        return new PageBean<Config>(pages);
    }

    @Override
    public List<Config> findAll(Config eo) {
        List<Config> list = configMapper.findList(eo);
        return list;
    }
    @Override
    public Config detail(Integer  pk) {
        Config eo = configMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(Integer  id,Config eo) {
        Config old = configMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = configMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(Config eo) {
        int result = configMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(Integer  pk) {
        int result = configMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(Integer ...pks) {
        int result = configMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}
package com.deepxi.services.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepxi.services.domain.eo.Ss;
import com.deepxi.services.service.SsService;
import com.deepxi.services.mapper.SsMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class SsServiceImpl implements SsService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SsMapper ssMapper;

    @Override
    public PageBean<Ss> findPage(Ss eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<Ss> pages =  ssMapper.findList(eo);
        return new PageBean<Ss>(pages);
    }

    @Override
    public List<Ss> findAll(Ss eo) {
        List<Ss> list = ssMapper.findList(eo);
        return list;
    }
    @Override
    public Ss detail(Integer  pk) {
        Ss eo = ssMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(Integer  id,Ss eo) {
        Ss old = ssMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = ssMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(Ss eo) {
        int result = ssMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(Integer  pk) {
        int result = ssMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(Integer ...pks) {
        int result = ssMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}
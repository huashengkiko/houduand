package com.deepxi.services.service;

import com.deepxi.services.domain.eo.Config;
import com.deepxi.services.domain.dto.ConfigDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * config
 */
public interface ConfigService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<Config> findPage(Config eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<Config> findAll(Config eo);

    /**
      获取详情
    * @return
    */
    Config detail(Integer  pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(Integer  id,Config eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(Config eo);

    /**
     * 单个删除
    * @return
    */
    Boolean delete(Integer  pk);

    /**
     批量删除
    * @return
    */
    Boolean delete(Integer ...pk);
}
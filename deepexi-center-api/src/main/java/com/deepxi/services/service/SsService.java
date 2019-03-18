package com.deepxi.services.service;

import com.deepxi.services.domain.eo.Ss;
import com.deepxi.services.domain.dto.SsDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * sss
 */
public interface SsService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<Ss> findPage(Ss eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<Ss> findAll(Ss eo);

    /**
      获取详情
    * @return
    */
    Ss detail(Integer  pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(Integer  id,Ss eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(Ss eo);

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
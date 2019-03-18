package com.deepxi.services.domain.dto;

import com.deepxi.services.domain.eo.Config;
import java.util.Collection;
import java.util.List;

/**
* @desc config
* @author admin
*/
public class ConfigDto extends Config{

public ConfigDto(){};

public ConfigDto(Config eo) {
    this.setId(eo.getId());
    this.setProjectNo(eo.getProjectNo());
    this.setKey(eo.getKey());
    this.setValue(eo.getValue());
    this.setDescription(eo.getDescription());
    this.setCreateBy(eo.getCreateBy());
    this.setCreateTime(eo.getCreateTime());
    this.setUpdateBy(eo.getUpdateBy());
    this.setUpdateTime(eo.getUpdateTime());
    this.setDr(eo.getDr());
}
}


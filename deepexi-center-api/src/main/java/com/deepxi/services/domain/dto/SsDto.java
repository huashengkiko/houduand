package com.deepxi.services.domain.dto;

import com.deepxi.services.domain.eo.Ss;
import java.util.Collection;
import java.util.List;

/**
* @desc sss
* @author 
*/
public class SsDto extends Ss{

public SsDto(){};

public SsDto(Ss eo) {
    this.setId(eo.getId());
    this.setCreatedBy(eo.getCreatedBy());
    this.setCreatedAt(eo.getCreatedAt());
    this.setUpdatedBy(eo.getUpdatedBy());
    this.setUpdatedAt(eo.getUpdatedAt());
}
}


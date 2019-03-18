package com.deepxi.services.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepxi.services.domain.eo.Config;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  ConfigMapper extends BaseMapper<Config> {

    List<Config> findList(@Param("eo")  Config eo);

    int deleteByIds(@Param("ids") List<Integer > ids);

}
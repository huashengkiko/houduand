package com.deepxi.services.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepxi.services.domain.eo.Ss;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  SsMapper extends BaseMapper<Ss> {

    List<Ss> findList(@Param("eo")  Ss eo);

    int deleteByIds(@Param("ids") List<Integer > ids);

}
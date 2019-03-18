package com.deepxi.services.domain.eo;


import java.util.Date;
import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Collection;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
* @desc config
* @author admin
*/
//@ApiModel(description = "config")
public class Config{

// @ApiModelProperty(value = "id")
    @TableId
    @TableField(value = "`id`")
    private Integer  id;
// @ApiModelProperty(value = "项目标识")
    @TableField(value = "`project_no`")
    private String projectNo;
// @ApiModelProperty(value = "key")
    @TableField(value = "`key`")
    private String key;
// @ApiModelProperty(value = "value")
    @TableField(value = "`value`")
    private String value;
// @ApiModelProperty(value = "描述")
    @TableField(value = "`description`")
    private String description;
// @ApiModelProperty(value = "创建人")
    @TableField(value = "`create_by`")
    private String createBy;
// @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`create_time`")
    private Date createTime;
// @ApiModelProperty(value = "更新人")
    @TableField(value = "`update_by`")
    private String updateBy;
// @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`update_time`")
    private Date updateTime;
// @ApiModelProperty(value = "删除标记")
    @TableLogic
    @TableField(value = "`dr`")
    private Boolean dr;

    public void setId(Integer  id){
    this.id = id;
    }

    public Integer  getId(){
    return this.id;
    }

    public void setProjectNo(String projectNo){
    this.projectNo = projectNo;
    }

    public String getProjectNo(){
    return this.projectNo;
    }

    public void setKey(String key){
    this.key = key;
    }

    public String getKey(){
    return this.key;
    }

    public void setValue(String value){
    this.value = value;
    }

    public String getValue(){
    return this.value;
    }

    public void setDescription(String description){
    this.description = description;
    }

    public String getDescription(){
    return this.description;
    }

    public void setCreateBy(String createBy){
    this.createBy = createBy;
    }

    public String getCreateBy(){
    return this.createBy;
    }

    public void setCreateTime(Date createTime){
    this.createTime = createTime;
    }

    public Date getCreateTime(){
    return this.createTime;
    }

    public void setUpdateBy(String updateBy){
    this.updateBy = updateBy;
    }

    public String getUpdateBy(){
    return this.updateBy;
    }

    public void setUpdateTime(Date updateTime){
    this.updateTime = updateTime;
    }

    public Date getUpdateTime(){
    return this.updateTime;
    }

    public void setDr(Boolean dr){
    this.dr = dr;
    }

    public Boolean getDr(){
    return this.dr;
    }


}


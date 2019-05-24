package com.wantao.springbootmysqlcrud.result;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回的Json数据封装
 */
@Data
@NoArgsConstructor
public class Result{
    private Integer code;
    private String msg;
    private Map<String, Object> data = new HashMap<String, Object>();

    /**
     * 成功时调用
     * 默认状态码:200
     */
    public static Result success() {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("处理成功");
        return result;
    }

    /**
     * 失败时调用
     * 默认状态码:500
     */
    public static Result error() {
        Result result = new Result();
        result.setCode(500);
        result.setMsg("处理失败");
        return result;
    }

    /**
     * 设置数据
     * @param key
     * @param value
     * @return
     */
    public Result add(String key,Object value){
        this.data.put(key,value);
        return this;
    }

}
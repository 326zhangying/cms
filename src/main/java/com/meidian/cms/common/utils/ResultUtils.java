package com.meidian.cms.common.utils;

import com.meidian.cms.common.Enum.ErrorCode;
import com.meidian.cms.common.Result;
import org.springframework.data.domain.Page;

import java.util.List;

public class ResultUtils {

    public static Result returnFalse(Integer errorCode, String msg){
        Result result = new Result();
        result.setCode(errorCode);
        result.setMsg(msg);
        return result;
    }

    public static Result returnFalse(Integer errorCode){
        Result result = new Result();
        result.setCode(errorCode);
        return result;
    }

    public static Result returnTrue(){
        Result result = new Result();
        result.setCode(ErrorCode.SUCCESS.getCode());
        result.setMsg(ErrorCode.SUCCESS.getMessage());
        return result;
    }

    public static Result returnTrue(String msg){
        Result result = new Result();
        result.setCode(ErrorCode.SUCCESS.getCode());
        result.setMsg(msg);
        return result;
    }

    public static Result returnTrue(List body){
        Result result = new Result();
        result.setCode(ErrorCode.SUCCESS.getCode());
        result.setMsg(ErrorCode.SUCCESS.getMessage());
        result.setData(body);
        result.setCount((long)body.size());
        return result;
    }

    public static Result returnTrue(Page page){
        Result result = new Result();
        result.setCode(ErrorCode.SUCCESS.getCode());
        result.setData(page.getContent());
        result.setCount(page.getTotalElements());
        return result;
    }
}

package com.harukaze.shop.product.exception;

import com.harukaze.common.exception.BizCodeEnume;
import com.harukaze.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

/**
 * @PackageName: com.harukaze.shop.product.exception
 * @ClassName: ControllerAdvice
 * @Description:
 * @Author: doki
 * @Date: 2022/4/17 18:38
 */

@Slf4j
//@RestControllerAdvice(basePackages = "com.harukaze.shop.product.controller")
public class ProductControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e) {
        log.error("数据校验异常:{}, 异常类型:{}", e.getMessage(), e.getClass());
        BindingResult bindingResult = e.getBindingResult();

        HashMap<Object, Object> map = new HashMap<>();
        bindingResult.getFieldErrors().forEach((fieldError) -> {
            map.put(fieldError.getField(), fieldError.getDefaultMessage());
        });
        return R.error(BizCodeEnume.VALID_EXCEPTION.getCode(), BizCodeEnume.VALID_EXCEPTION.getMsg()).put("data", map);
    }

    @ExceptionHandler(Exception.class)
    public R handleException(Exception e) {
        log.error("数据校验异常:{}, 异常类型:{}", e.getMessage(), e.getClass());
        return R.error(BizCodeEnume.UNKNOW_EXCEPTION.getCode(), BizCodeEnume.UNKNOW_EXCEPTION.getMsg());
    }
}

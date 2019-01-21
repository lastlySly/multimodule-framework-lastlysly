package com.lastlysly.common.core.exception;

import com.lastlysly.common.core.Constants;

/**
 * 统一异常基类
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2019-01-21 14:35
 **/
public abstract class BaseException extends RuntimeException {
    public BaseException() {
    }

    public BaseException(Throwable ex) {
        super(ex);
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable ex) {
        super(message, ex);
    }

    /**
     * 获取错误码
     *
     * @return ResultCodeEnum 错误码
     * @author lastlySly
     * @date 2019-01-21 14:35
     */
    public abstract Constants.ResultCodeEnum getCode();
}

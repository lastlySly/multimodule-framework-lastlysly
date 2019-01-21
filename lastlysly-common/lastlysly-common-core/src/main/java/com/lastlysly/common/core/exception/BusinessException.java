package com.lastlysly.common.core.exception;

import com.lastlysly.common.core.Constants;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2019-01-21 14:34
 *
 * 业务异常类
 **/
public class BusinessException extends BaseException {
    public BusinessException() {
        super();
    }

    public BusinessException(Throwable ex) {
        super(ex);
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable ex) {
        super(message, ex);
    }

    /**
     * 获取错误码
     *
     * @return ResultCodeEnum 错误码
     * @author lastlySly
     * @date 2019-01-21 14:35
     */
    @Override
    public Constants.ResultCodeEnum getCode() {
        return Constants.ResultCodeEnum.INTERNAL_SERVER_ERROR;
    }
}

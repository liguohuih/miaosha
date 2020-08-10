package com.miaoshaproject.error;

/**
 * @Author：wantong
 * @Date：2020-08-10 23:03
 * @Description：
 */
//包装器器业务异常类实现
public class BusinessException extends Exception implements CommonError{

    private CommonError commonError;

    //构造方法，直接接收EmBusinessError的传参用于构造业务异常
    public BusinessException(CommonError commonError){
        super();//加载Exception
        this.commonError = commonError;
    }

    //接收自定义errMSG的方式构造业务异常
    public BusinessException(CommonError commonError,String errMsg){
       super();
       this.commonError = commonError;
       this.commonError.setErrMsg(errMsg);
    }

    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}

package com.miaoshaproject.error;

/**
 * @Author：wantong
 * @Date：2020-08-10 22:49
 * @Description：
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);


}

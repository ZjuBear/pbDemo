package com.example.EnumDemo;

/**
 * Created by juchen on 16/12/7.
 */
public enum ReturnCode {

    Success(1001, "success", "SUCCESS"),
    ParamEmpty(4001, "参数不能为空", "4001"),
    IllegalParam(4002, "非法参数", "4002"),
    RemoteServiceError(4003, "远端服务调用失败!", "4003"),
    RemoteServiceDataEmpty(4004, "远端数据为空", "4004"),
    ParamError(4005, "参数错误", "4005"),
    DatabaseError(4006,"数据库错误!", "4006"),
    DataEmpty(4007, "数据为空!", "4007"),
    UnkownError(4008, "未知错误", "4008"),
    LoginSessionInvalid(4009, "没有得到session信息","4009"),
    RedisError(4010,"cache错误","4010"),
    BizError(4011,"业务错误","4011"),
    Unsupport(4012, "不支持该功能","4012"),
    NotLogin(1022, "未登录", "1022"),
    UrlError(230002, "URL异常", "230002"),
    RomoteDataEmpty(1000011,"远端数据为空","1000011"),
    //todo tobe insure
    NoPermission(1000012,"没有权限","1000012");


    public int code;
    public String message;
    public String mwpCode;

    ReturnCode(int code, String message, String mwpCode) {
        this.code = code;
        this.message = message;
        this.mwpCode = mwpCode;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getMwpCode() {
        return mwpCode;
    }

    @Override
    public String toString() {
        return "ReturnCode{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", mwpCode='" + mwpCode + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println();
    }



}

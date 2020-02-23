package com.tian.rpc.client;

import java.io.Serializable;

public class RpcRequest implements Serializable {

    private String className;
    private String methodName;
    private Object[] args;

    public RpcRequest(){}

    public RpcRequest(String className, String methodName, Object[] args) {
        this.className = className;
        this.methodName = methodName;
        this.args = args;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }
}

package com.tian.rpc.client;

import java.lang.reflect.Proxy;

public class RpcClientProxy {

    public <T> T clientPoxy(final Class<T> intefaceCla,final String host,final int port){
        return (T)Proxy.newProxyInstance(intefaceCla.getClassLoader(),
                new Class[]{intefaceCla},
                new RemoteInvocationHandler(host,port));
    }

}

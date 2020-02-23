package com.tian.rpc.client;

import com.tian.rpc.HelloSevice;

public class ClientTest {

    public static void main(String[] args) {
        RpcClientProxy rpcClientProxy = new RpcClientProxy();
        HelloSevice helloSevice = rpcClientProxy.clientPoxy(HelloSevice.class, "localhost", 8888);
        System.out.println(helloSevice.sayHello("mic"));
        System.out.println(helloSevice.sayHello2("dd"));
    }

}

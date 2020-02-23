package com.tian.rpc.server;

import com.tian.rpc.HelloSevice;

public class ServerTest {

    public static void main(String[] args) {
        HelloSevice helloSevice = new HelloServiceImpl();
        RpcServer rpcServer = new RpcServer();
        rpcServer.publish(helloSevice,8888);
    }

}

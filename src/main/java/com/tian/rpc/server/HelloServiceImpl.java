package com.tian.rpc.server;

import com.tian.rpc.HelloSevice;

public class HelloServiceImpl implements HelloSevice {

    @Override
    public String sayHello(String name) {
        return "hello:" + name;
    }

    @Override
    public String sayHello2(String name) {
        return "hello2:" + name;
    }

}

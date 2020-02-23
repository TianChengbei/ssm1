package com.tian.rpc.client;

import com.tian.test.So;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpTransport {

    private final String host;
    private final int port;

    public TcpTransport(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public Socket newSocket() {
        System.out.println("创建连接");
        Socket socket = null;
        try {
            socket = new Socket(host, port);
        } catch (IOException e) {
            throw new RuntimeException("建立连接失败");
        }
        return socket;
    }

    public Object send(RpcRequest request){
        Socket socket = null;
        try {
            socket = newSocket();
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject(request);
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            Object result = inputStream.readObject();
            outputStream.flush();
            outputStream.close();
            inputStream.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(null != socket){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}

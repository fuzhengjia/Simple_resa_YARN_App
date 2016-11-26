package com.test.thrift;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
/**
 * Created by Tom.fu on 25/11/2016.
 */
public class HelloWorldClient {
    public static void main(String[] args) throws Exception {
        TTransport transport = new TSocket("localhost", 7988);
        TProtocol protocol = new TBinaryProtocol(transport);

        // 创建client
        com.test.thrift.HelloWorldService.Client client = new com.test.thrift.HelloWorldService.Client(protocol);

        transport.open();  // 建立连接

        // 第一种请求类型
        com.test.thrift.Request request = new com.test.thrift.Request()
                .setType(RequestType.Say_hello).setName("test.tom").setAge(20);
        System.out.println(client.doAction(request));

        // 第二种请求类型
        request.setType(RequestType.Query_time).setName("test.tom");
        System.out.println(client.doAction(request));

        transport.close();  // 请求结束，断开连接
    }
}

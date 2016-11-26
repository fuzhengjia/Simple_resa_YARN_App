package com.test.thrift;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;

import java.net.ServerSocket;
/**
 * Created by Tom.fu on 25/11/2016.
 */
public class HelloWorldServer {

    public static void main(String[] args) throws Exception {
        ServerSocket socket = new ServerSocket(7988);
        TServerSocket serverTransport = new TServerSocket(socket);
        com.test.thrift.HelloWorldService.Processor processor
                = new com.test.thrift.HelloWorldService.Processor(new HelloWorldServiceHandler());
        TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));
        System.out.println("Running server...");
        server.serve();
    }
}

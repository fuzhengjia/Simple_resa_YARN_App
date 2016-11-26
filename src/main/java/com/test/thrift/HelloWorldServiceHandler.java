package com.test.thrift;

import org.apache.commons.lang.StringUtils;
import org.apache.thrift.TException;

import java.util.Date;

/**
 * Created by Tom.fu on 25/11/2016.
 */
public class HelloWorldServiceHandler implements com.test.thrift.HelloWorldService.Iface {
    public String doAction(com.test.thrift.Request req) throws com.test.thrift.RequestException, TException {
        System.out.println("Get request: " + req);
        if (StringUtils.isBlank(req.getName()) || req.getType() == null) {
            throw new com.test.thrift.RequestException();
        }
        String result = "Hello " + req.getName();
        if (req.getType() == RequestType.Say_hello) {
            result += ", welcome!";
        } else {
            result += ", now is " + new Date().toString();

        }
        return result;
    }
}

package com.krex.cloudpro.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class ControllerTest {
    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String info() {
        String localName = "";
        String localIp = "";
        try {
            InetAddress ip = InetAddress.getLocalHost();
            localName=ip.getHostName();
            localIp=ip.getHostAddress();
            System.out.println("本机名称是："+ localName);
            System.out.println("本机的ip是 ："+localIp);
        } catch (Exception e) {
        }
        return "Hello, hostname : "+localName+"  ip :  "+localIp+"  port : "+port+" applicationName : "+applicationName +" prepare already !";
    }
}

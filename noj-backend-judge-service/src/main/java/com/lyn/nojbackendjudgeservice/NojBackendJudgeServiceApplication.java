package com.lyn.nojbackendjudgeservice;

import com.lyn.nojbackendjudgeservice.rabbitmq.MqInitMain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

// todo 如需开启 Redis，须移除 exclude 中的内容
//@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.lyn")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.lyn.nojbackendserviceclient.service"})
public class NojBackendJudgeServiceApplication {

    public static void main(String[] args) {
        // 初始化消息队列
        MqInitMain.doInit();
        SpringApplication.run(NojBackendJudgeServiceApplication.class, args);
    }

}

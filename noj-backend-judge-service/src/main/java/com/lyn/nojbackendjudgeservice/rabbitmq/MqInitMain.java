package com.lyn.nojbackendjudgeservice.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * 用于创建测试程序用到的交换机和队列（只用在程序启动前执行一次）
 */
@Slf4j
public class MqInitMain {
    public static void doInit(){
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("localhost");
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();
            String EXCHANGE_NAME = "code_exchange";
            channel.exchangeDeclare(EXCHANGE_NAME, "direct");

            // 创建队列，随机分配一个队列名称
            String queueName = "code_queue";
            channel.queueDeclare(queueName, true, false, false, null);
            channel.queueBind(queueName, EXCHANGE_NAME, "my_routingKey");
            log.info("初始化队列成功");
        } catch (Exception e) {
            log.error("初始化队列失败", e);
        }
    }

    public static void main(String[] args) {
        doInit();
    }
}
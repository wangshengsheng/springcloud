package com.mt.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *
 * 不配置该类会出现下面的异常
 * BlockingQueueConsumer$DeclarationException: Failed to declare queue(s)：xxxx
 *
 * 具体解决办法：参考https://www.cnblogs.com/zwwang/p/13219336.html
 *
 *
 */
@Configuration
//创建MQ队列
public class MQconfig {
    @Bean
    public Queue queueOrder() {
        return new Queue("order_queue", true);
    }

    @Bean
    public Queue queueOrderStatus() {
        return new Queue("order_status_queue", true);
    }
}
package com.onlyedu.newclasses.mq.receiver;

import com.onlyedu.newclasses.model.User;
import com.onlyedu.newclasses.mq.config.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class FanoutReceiver {

    // queues是指要监听的队列的名字
    @RabbitListener(queues = RabbitConfig.FANOUT_QUEUE1)
    public void receiveTopic1(User user) {
        System.out.println("【receiveFanout1监听到消息】" + user);
    }

    @RabbitListener(queues = RabbitConfig.FANOUT_QUEUE2)
    public void receiveTopic2(User user) {
        System.out.println("【receiveFanout2监听到消息】" + user);
    }
}

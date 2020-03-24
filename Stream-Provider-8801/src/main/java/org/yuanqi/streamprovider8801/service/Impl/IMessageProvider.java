package org.yuanqi.streamprovider8801.service.Impl;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;

@EnableBinding(Source.class)// 定义消息的推送管道
public class IMessageProvider implements org.yuanqi.streamprovider8801.service.IMessageProvider {

    @Resource
    private MessageChannel output; //消息发送管道

    @Override
    public String send() {
        String message = "here is sender sending message";
        output.send(MessageBuilder.withPayload(message).build());
        return null;
    }
}

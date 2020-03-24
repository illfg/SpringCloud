package org.yuanqi.streamcustomer8990.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@EnableBinding({Sink.class})
public class ReceiveMessageListenerHandler {

    @Value("${server.port}")
    private String port;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("customer01 ------->"+message.getPayload()+"\t port: " +port);
    }

}

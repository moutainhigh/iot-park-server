package com.szzt.iot.agent.activemq.producer;

import com.szzt.iot.common.activemq.ActivemqMsg;

/**
 * 发送消息 接口类
 */
public interface IMessageProducerService {
    /**
     * 发送消息到activemq
     *
     * @param msg
     */
    public void sendMessage(ActivemqMsg msg);

}

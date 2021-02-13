package com.techprimers.kafka.springbootkafkaproducerexample.listner;

import com.techprimers.kafka.springbootkafkaproducerexample.model.Taxi;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test2", group = "group_json", containerFactory = "userKafkaListenerFactory")
    public void consumeJson(Taxi user) {
        System.out.println("Consumed JSON Messageddds: " + user);
        System.out.println("Consumed JSON MessageGeo: " + user.getGeo());

        System.out.println("Transaction completed");
    }
}

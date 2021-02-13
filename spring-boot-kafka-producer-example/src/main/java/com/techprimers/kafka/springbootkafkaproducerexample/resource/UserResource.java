package com.techprimers.kafka.springbootkafkaproducerexample.resource;

import java.net.http.HttpResponse;

import com.techprimers.kafka.springbootkafkaproducerexample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("kafka")
public class UserResource {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    private static final String TOPIC = "test1";

    @GetMapping("/publish/{source_loc}/{source_id}")
    public String post(@PathVariable("source_loc") final String source_loc,
            @PathVariable("source_id") final int source_id) {

        kafkaTemplate.send(TOPIC, new User(source_id, source_loc));

        return "index";
    }

    @GetMapping("/publish/")
    public String get() {

        return "home";
    }
}

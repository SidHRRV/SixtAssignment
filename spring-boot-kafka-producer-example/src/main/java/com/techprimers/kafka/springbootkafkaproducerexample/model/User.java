package com.techprimers.kafka.springbootkafkaproducerexample.model;

public class User {

    private int source_id;
    private String source_loc;

    public User(int source_id, String source_loc) {
        this.source_id = source_id;
        this.source_loc = source_loc;

    }

    public int getSource_id() {
        return source_id;
    }

    public String getSource_loc() {
        return source_loc;
    }

    public void setSource_id(int source_id) {
        this.source_id = source_id;
    }

    public void setSource_loc(String source_loc) {
        this.source_loc = source_loc;
    }

}

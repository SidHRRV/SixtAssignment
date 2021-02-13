package com.techprimers.kafka.springbootkafkaproducerexample.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "serverresponse")
public class Taxi implements Serializable {

    private static final long serialVersionUID = -2343243243242432341L;
    @Id

    @Column(name = "transaction_id")
    private int transaction_id;

    @Column(name = "source_id")
    private int source_id;

    @Column(name = "source_loc")
    private String source_loc;

    @Column(name = "location")
    private String location;

    @Column(name = "location_id")
    private int location_id;

    @Column(name = "geolocation")
    private String geo;

    Taxi() {

    }

    public Taxi(int transaction_id, int source_id, String source_loc, String location, int location_id, String geo) {
        this.transaction_id = transaction_id;
        this.source_id = source_id;
        this.source_loc = source_loc;
        this.location = location;
        this.location_id = location_id;
        this.geo = geo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Taxi{");
        sb.append("name='").append(location).append('\'');
        sb.append(", dept='").append(source_loc).append('\'');
        sb.append(", salary='").append(geo).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getSource_loc() {
        return source_loc;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getSource_id() {
        return source_id;
    }

    public void setSource_id(int source_id) {
        this.source_id = source_id;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSource_loc(String source_loc) {
        this.source_loc = source_loc;
    }

}

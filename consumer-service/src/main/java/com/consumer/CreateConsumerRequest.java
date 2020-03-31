package com.consumer;

public class CreateConsumerRequest {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateConsumerRequest(String name) {
        this.name = name;
    }

    private CreateConsumerRequest() { }
}

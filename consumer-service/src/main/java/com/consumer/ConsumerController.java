package com.consumer;

import com.consumer.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Consumer;

@RestController
@RequestMapping(path="/consumers")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(method= RequestMethod.POST)
    public CreateConsumerResponse create(@RequestBody CreateConsumerRequest request) {
        ResultWithEvents<Consumer> result = consumerService.create(request.getName());
        return new CreateConsumerResponse(result.result.getId());
    }
}

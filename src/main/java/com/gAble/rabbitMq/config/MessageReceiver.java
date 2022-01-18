package com.gAble.rabbitMq.config;

import com.gAble.rabbitMq.entity.Products;
import com.gAble.rabbitMq.service.ProductService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;


@RabbitListener(queues = "#{autoDeletedQueue.name}")
public class MessageReceiver {

    @Autowired
    ProductService productService;

    @RabbitHandler
    public void receive(Products product) {
        System.out.println(product);
        productService.createProduct(product);
    }

}
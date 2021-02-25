package br.com.matheuscosantos.producer.domain;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orders")
public class OrderProducerController {
    private final OrderProducer orderProducer;

    public OrderProducerController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    @PostMapping
    public void send(@RequestBody String order) {
        orderProducer.send(order);
    }
}

package com.eesenn0.bookstore.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eesenn0.bookstore.dto.BookOrderRequest;
import com.eesenn0.bookstore.model.Order;
import com.eesenn0.bookstore.service.OrderService;

@RestController
@RequestMapping("/v1/bookstore")
public class BookStoreController {
    
    private final OrderService orderService;

    public BookStoreController(OrderService orderService) {
        this.orderService = orderService;
    } 

    @GetMapping
    public ResponseEntity<String> helloTwitch() {
        return ResponseEntity.ok("Hello Twitch");
    }

    @PostMapping
    public ResponseEntity<Order> putAnOrder(@RequestBody BookOrderRequest bookOrderRequest) {
        Order order = orderService.putAnOrder(bookOrderRequest.getBookIdList(), bookOrderRequest.getUserName());

        return ResponseEntity.ok(order);
    }
}

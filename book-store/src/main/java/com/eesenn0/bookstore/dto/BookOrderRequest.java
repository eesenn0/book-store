package com.eesenn0.bookstore.dto;

import java.util.List;

import lombok.Data;

@Data
public class BookOrderRequest {
    
    private List<Integer> bookIdList;
    private String userName;
}

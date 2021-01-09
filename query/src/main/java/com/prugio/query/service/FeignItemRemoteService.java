package com.prugio.query.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "command", fallbackFactory = FeignItemRemoteServiceFallbackFactory.class)
public interface FeignItemRemoteService {
    @RequestMapping(path = "/items/{item_no}")
    String getItem(@PathVariable("item_no") String item_no);
}

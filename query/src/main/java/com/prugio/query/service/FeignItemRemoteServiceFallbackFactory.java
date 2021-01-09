package com.prugio.query.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FeignItemRemoteServiceFallbackFactory implements FallbackFactory<FeignItemRemoteService> {
    @Override
    public FeignItemRemoteService create(Throwable cause) {

        System.out.println("t = " + cause);
        cause.printStackTrace();

        return item_no-> "[ this item is sold out ]";
    }
}

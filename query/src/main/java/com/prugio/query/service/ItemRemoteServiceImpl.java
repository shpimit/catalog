package com.prugio.query.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ItemRemoteServiceImpl implements ItemRemoteService {

//    public static final String URL = "http://catalog/items/";
//    public static final String URL = "http://COMMAND/items/";
    public static final String URL = "http://command/items/";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "getItemFallback")
    public String getItem(String item_no) {
        return restTemplate.getForObject(URL + item_no, String.class);
    }

    public String getItemFallback(String item_no, Throwable t) {
        System.out.println("t="+t);
        return "Wait a minute[]";
    }

}

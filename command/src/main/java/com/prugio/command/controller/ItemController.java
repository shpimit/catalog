package com.prugio.command.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"1. item_no"})
@RestController
@RequestMapping("/items")
public class ItemController {

    @PostMapping("/{item_no}")
    public String createItem(@PathVariable("item_no") String item_no) {
        return "[item_no id = " + item_no + " at " + System.currentTimeMillis() + "]";
    }

    @ApiOperation(value = "품번", notes = "품번을 조회한다.")
    @GetMapping("/{item_no}")
    public String getItem(@PathVariable("item_no") String item_no) {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        throw new RuntimeException("I/O Exception");
        System.out.println("Called item_no="+item_no);
        return "[item_no id = " + item_no + " at " + System.currentTimeMillis() + "]";
    }
}

package com.prugio.query.controller;

import com.prugio.query.entity.ItemSummary;
import com.prugio.query.service.FeignItemRemoteService;
import com.prugio.query.service.ItemRemoteService;
import com.prugio.query.service.ItemSummaryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Api(tags = {"1. item_no"})
@Slf4j
@RestController
@RequestMapping("/query")
public class QueryController {

//    public static List<ItemSummary> items;
//
//    static {
//        long time = System.currentTimeMillis();
////        SimpleDateFormat dayTime = new SimpleDateFormat("yyyymmdd hh:mm:ss");
//        SimpleDateFormat dayTime = new SimpleDateFormat("yyyymmdd");
//        String addDate = dayTime.format(new java.util.Date(time));
//
//        items = new ArrayList<>();
//        items.add(new ItemSummary(1L, "GS2020001","US","장갑","공구","270","EA","나이키","골프용","서울","260360980","2279894",addDate));
//        items.add(new ItemSummary(2L, "GB2020001","US","안전화","공구","270","EA","나이키","에어조단","서울","260360980","2279894",addDate));
//        items.add(new ItemSummary(3L, "GB2020001","US", "안전화","공구","260","EA","아디다스","메시","東京","260360980","2279894",addDate));
//
//        System.out.println(items);
//    }
    @Autowired
    private final ItemSummaryService itemSummaryService;

    private final ItemRemoteService itemRemoteService;
    private final FeignItemRemoteService feignItemRemoteService;

    public QueryController(ItemSummaryService itemSummaryService, ItemRemoteService itemRemoteService, FeignItemRemoteService feignItemRemoteService) {
        this.itemSummaryService = itemSummaryService;
        this.itemRemoteService = itemRemoteService;
        this.feignItemRemoteService = feignItemRemoteService;
    }

//    public QueryController(ItemSummaryService itemSummaryService, ItemRemoteService itemRemoteService, FeignItemRemoteService feignItemRemoteService) {
//        this.itemSummaryService = itemSummaryService;
//        this.itemRemoteService = itemRemoteService;
//        this.feignItemRemoteService = feignItemRemoteService;
//    }
//
//    public QueryController(ItemSummaryService itemSummaryServicee) {
//        this.itemSummaryService = itemSummaryService;
//    }

    @GetMapping("items/{item_no}")
    public String getItem(@PathVariable("item_no") String item_no) {
//        String productInfo = itemRemoteService.getItem("1111");
        String itemInfo = feignItemRemoteService.getItem("12345");

        return String.format("[query id = %s at %s %s ]", item_no, System.currentTimeMillis(), itemInfo);
    }

    @ApiOperation(value = "품목", notes = "품목 전체 조회한다.")
    @GetMapping("/items")
    public List<ItemSummary> findAll() {

        System.out.println("getAllItems");
        log.debug("품목 전체보기::repository..");
        List<ItemSummary> itemSummaries = itemSummaryService.findAll();
        System.out.println("getAllItems1");
        log.debug("품목 전체보기1::repository..");
        return itemSummaries;
    }

    @ApiOperation(value = "품목", notes = "품목 전체 조회한다.")
    @PostMapping
    public ResponseEntity save(@Valid @RequestBody ItemSummary itemSummary) {
        log.debug("Post=============================");
        return ResponseEntity.ok(itemSummaryService.save(itemSummary));
    }

    @ApiOperation(value = "품목", notes = "품목 1개 조회한다.")
    @GetMapping("/{id}")
    public ResponseEntity<ItemSummary> findById(@PathVariable Long id) {

        Optional<ItemSummary> itemSummary = itemSummaryService.findById(id);
        if (!itemSummary.isPresent()) {
            log.error("Id " + id + " is not existed");
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(itemSummary.get());
    }

    @ApiOperation(value = "품목", notes = "품목 삭제한다.")
    @DeleteMapping("/{id}")
    public ResponseEntity  delete(@PathVariable Long id) {
        if (!itemSummaryService.findById(id).isPresent()) {
            log.error("Id " + id + " is not existed");
            ResponseEntity.badRequest().build();
        }

        itemSummaryService.deleteById(id);

        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "품목", notes = "품목정보 수정한다.")
    @PutMapping("/{id}")
    public ResponseEntity<ItemSummary> update(@PathVariable Long id, @Valid @RequestBody ItemSummary itemSummary) {
        if (!itemSummaryService.findById(id).isPresent()) {
            log.error("Id " + id + " is not existed");
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(itemSummaryService.save(itemSummary));
    }
}

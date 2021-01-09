package com.prugio.query.service;

import com.prugio.query.entity.ItemSummary;
import com.prugio.query.repository.ItemSummaryRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(false)
public class ItemSummaryServiceTests {

    @Autowired
    private ItemSummaryRepository itemSummaryRepository;

    @Test
    public void saveItemTest() {

        //given
//        items = new ArrayList<>();
//        ItemSummary itemSummary = new ItemSummary(1L, "GS2020001","US","장갑","공구","270","EA","나이키","골프용","서울","260360980","2279894",addDate);
        ItemSummary itemSummary = new ItemSummary();
        itemSummary.setId(1L);
        itemSummary.setItem_no("GS2020001");
        itemSummary.setImage("US");
        itemSummary.setDescription_loc("장갑");
        itemSummary.setMaterial_class("공구");
        itemSummary.setSpecification("270");
        itemSummary.setBasic_unit("EA");
        itemSummary.setMaker_name("나이키");
        itemSummary.setModel_no("골프용");;
        itemSummary.setOrigin_country("서울");
        itemSummary.setHs_no("260360980");
        itemSummary.setAdd_user_id("2279894");
//        long time = System.currentTimeMillis();
////        SimpleDateFormat dayTime = new SimpleDateFormat("yyyymmdd hh:mm:ss");
//        SimpleDateFormat dayTime = new SimpleDateFormat("yyyymmdd");
//        String addDate = dayTime.format(new java.util.Date(time));
//        itemSummary.setAdd_date(addDate);
        itemSummary.setAdd_date(LocalDateTime.now());

        itemSummaryRepository.save(itemSummary);

        // when
        Optional<ItemSummary> items = itemSummaryRepository.findById(1L);

        // then
        items.ifPresent(selectItem ->{
            System.out.println("itemSummary: "+selectItem);
            Assert.assertEquals(selectItem.getItem_no(), "GS2020001");
            Assert.assertEquals(selectItem.getAdd_user_id(), "2279894");
        });

    }
}

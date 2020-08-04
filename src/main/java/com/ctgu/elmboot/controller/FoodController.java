package com.ctgu.elmboot.controller;


import com.ctgu.elmboot.po.Food;
import com.ctgu.elmboot.service.FoodService;
import com.ctgu.elmboot.util.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @RequestMapping("/list")
    public List<Food> getFoodList(){
        return foodService.selectFoodList();
    }
    @RequestMapping(value = "/pageAll",method = RequestMethod.POST)
    public Object findPage(@RequestBody PageRequest pageQuery){
        return foodService.findPage(pageQuery);
    }
}

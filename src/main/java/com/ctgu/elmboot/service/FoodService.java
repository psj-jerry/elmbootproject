package com.ctgu.elmboot.service;
import com.ctgu.elmboot.po.Food;
import com.ctgu.elmboot.util.PageRequest;
import com.ctgu.elmboot.util.PageResult;

import java.util.List;

public interface FoodService {
    List<Food> selectFoodList();
    PageResult findPage(PageRequest pageRequest);
}

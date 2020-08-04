package com.ctgu.elmboot.service.impl;


import com.ctgu.elmboot.mapper.FoodMapper;
import com.ctgu.elmboot.po.Food;
import com.ctgu.elmboot.service.FoodService;
import com.ctgu.elmboot.util.PageRequest;
import com.ctgu.elmboot.util.PageResult;
import com.ctgu.elmboot.util.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
    @Resource
    private FoodMapper foodMapper;
    @Override
    public List<Food> selectFoodList() {
        return foodMapper.selectFoodList();
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest,getPageInfo(pageRequest));
    }

    private PageInfo<Food> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<Food> sysMenus = foodMapper.pageAll();
        return new PageInfo<Food>(sysMenus);
    }
}

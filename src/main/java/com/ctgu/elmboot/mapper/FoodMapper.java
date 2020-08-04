package com.ctgu.elmboot.mapper;
import com.ctgu.elmboot.po.Food;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface FoodMapper {
    List<Food> selectFoodList();
    List<Food> pageAll();
}

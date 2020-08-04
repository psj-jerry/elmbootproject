package com.ctgu.elmboot.mapper;
import org.apache.ibatis.annotations.Mapper;
import com.ctgu.elmboot.po.User;
import java.util.List;

@Mapper
public interface UserMapper {
    List<User> selectUserList();
}

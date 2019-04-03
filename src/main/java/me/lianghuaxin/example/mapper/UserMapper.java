package me.lianghuaxin.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.lianghuaxin.example.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends BaseMapper<User> {
}

package me.lianghuaxin.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import me.lianghuaxin.example.entity.User;
import me.lianghuaxin.example.mapper.UserMapper;
import me.lianghuaxin.example.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}

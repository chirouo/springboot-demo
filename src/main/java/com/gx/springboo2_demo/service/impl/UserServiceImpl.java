package com.gx.springboo2_demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gx.springboo2_demo.mapper.User;
import com.gx.springboo2_demo.service.UserService;
import com.gx.springboo2_demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 26274
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-12-17 15:59:22
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}





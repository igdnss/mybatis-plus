package com.baomidou.samples.metainfo.service;

import com.baomidou.samples.metainfo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    UserMapper userMapper;

}

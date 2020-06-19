package com.confused.min.service.impl;

import com.confused.min.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String testService() {
        return "hello Test";
    }
}

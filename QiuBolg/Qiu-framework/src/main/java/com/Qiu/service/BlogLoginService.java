package com.Qiu.service;

import com.Qiu.domain.ResponseResult;
import com.Qiu.domain.entity.User;

public interface BlogLoginService {
    ResponseResult login(User user);
    //退出登录
    ResponseResult logout();
}
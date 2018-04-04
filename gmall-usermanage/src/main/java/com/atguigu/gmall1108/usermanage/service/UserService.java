package com.atguigu.gmall1108.usermanage.service;

import com.atguigu.gmall1108.usermanage.bean.UserInfo;

import java.util.List;

/**
 * @param
 * @return
 */
public interface UserService {

    public List<UserInfo> getUserInfoListAll();

    public void addUser(UserInfo userInfo);

    public void updateUser(String id,UserInfo userInfo);
}

package com.emall.service;

import com.emall.common.ServerResponse;
import com.emall.pojo.User;

/**
 * Created by Administrator on 2017/10/19.
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str, String type);

    ServerResponse<String> selectQuestion(String username);

    ServerResponse<String> checkAnswer(String username, String question, String answer);

    ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken);

    ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user);

    ServerResponse<User> updateInfomation(User user);

    ServerResponse<User> getInfomation(Integer id);
}

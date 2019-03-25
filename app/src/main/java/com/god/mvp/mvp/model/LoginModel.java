package com.god.mvp.mvp.model;

import com.god.mvp.mvp.bean.User;

/**
 * Learn from yesterday, live for today, hope for tomorrow.
 */
public interface LoginModel {
    void login(String username, String password, OnLoginListener onLoginListener);

    interface OnLoginListener {
        void loginSuccess(User user);

        void loginFailed(String s);
    }
}

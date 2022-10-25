package com.example.Kata_3_1_1.service;

import com.example.Kata_3_1_1.model.User;


import java.util.List;

public interface UserService {
    List<User> printUser();

    void add(User user);

    void deleteById(int id);

    void edit(User user);

    User getById(int id);
}

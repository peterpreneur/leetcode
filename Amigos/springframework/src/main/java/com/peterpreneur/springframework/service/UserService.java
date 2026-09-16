/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.peterpreneur.springframework.service;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 *
 * @author peter
 */
@Service
public class UserService {

    public record User(int id, String name) {

    }

    ;

    public List<User> getUsers() {
        return List.of(new User(1, "Peter"), new User(2, "Sunny"));
    }


}

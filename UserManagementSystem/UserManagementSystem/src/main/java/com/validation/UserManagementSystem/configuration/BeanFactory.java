package com.validation.UserManagementSystem.configuration;

import com.validation.UserManagementSystem.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {
    @Bean
    public List<User> getInitializedList(){
        User initUser = new User(1,"Amit", LocalDate.of(2000,01,01),"amitinfotech485@gmail.com","9532567898",LocalDate.of(2023,06,28), LocalTime.of(6,0,0));
        List<User> initList=new ArrayList<>();
        initList.add(initUser);

        return initList;
    }
}
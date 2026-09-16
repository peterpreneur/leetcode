package com.peterpreneur.springframework;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.peterpreneur.springframework.service.UserService;

@SpringBootApplication
public class SpringframeworkApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringframeworkApplication.class, args);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        System.out.println(beanDefinitionNames.length);

        Map<String, String> stringBeans = context.getBeansOfType(String.class);
        stringBeans.forEach((beanName, beanValue) -> {
            System.out.println(beanName + " = " + beanValue);
        });

        UserService userServices = context.getBean(UserService.class);

        List<UserService.User> users = userServices.getUsers();

        for (UserService.User user : users) {
            System.out.println("Id: " + user.id() + ", Name: " + user.name());
        }
        System.out.println(users.size());
        System.out.println(users.get(0).id());
        System.out.println(users.get(0).name());
    }

    @Bean
    public String redBean() {
        return "MU";
    }

    @Bean
    public String blueBean() {
        return "Chelsea";
    }

    @Bean
    public CommandLineRunner printTeams(
            @Qualifier("redBean") String red,
            @Qualifier("blueBean") String blue) {

        return args -> {
            System.out.println("Red bean: " + red);
            System.out.println("Blue bean: " + blue);
        };
    }

}

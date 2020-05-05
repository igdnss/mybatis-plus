package com.baomidou.samples.metainfo;

import com.baomidou.samples.metainfo.entity.User;
import com.baomidou.samples.metainfo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 启动器
 * @author nieqiurong 2018-08-10 22:54:15.
 */
@SpringBootApplication
public class Application {
    @Autowired
    UserMapper userMapper;
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context){
        User user = new User();
        user.setAge(1);
        user.setEmail("a");
        user.setName("aaa");
        return args -> {
            userMapper.insert(user);
        };
    }
    
}

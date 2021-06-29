package com.cos.controllerdemo.web;

import com.cos.controllerdemo.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpJavaJsonController {

    @GetMapping("/java/json/object")
    public User JavaJsonObject() {
        User user = new User();
        user.setUsername("홍길동");

        return user;//1. MessageConverter가 자동으로 JavaObject를 Json으로 변환해서 리턴해준다.
                    //2. @RestController일때만 MessageConverter가 동작
    }
}

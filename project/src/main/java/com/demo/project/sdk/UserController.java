package com.demo.project.sdk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    // 모든 회원 조회
    @GetMapping(value = "/getAllUser")
    public List<User> getAllUser() {
        System.out.println("UserController.getAllUser");
        List<User> user = userService.findAll();
        System.out.println("List user =>" + user);
        return user;
    }

    // 회원 1명 조회
    @GetMapping(value = "/getUser")
    public User getUser(@RequestParam(name = "id") Long id) {
        System.out.println("id ?" + id);
        User user = userService.findById(id);
        System.out.println("user =>" + user);
        return user;
    }
    
    // 회원등록
    @PostMapping(value = "/writeUser",  produces = {MediaType.APPLICATION_JSON_VALUE })
    public void writeUser(@RequestBody User user){
        System.out.println("UserController.writeUser");
        System.out.println("writeUser? " + user);
        userService.insert(user);
    }

    // 회원삭제
    @PostMapping(value = "/deleteUser")
    public void deleteUser(@RequestBody User user){
        System.out.println("UserController.deleteUser");
        System.out.println("deleteUser? " + user);
        Long id = user.getId();
        userService.deleteById(id);
    }

    //회원수정
    @PostMapping(value = "/updateUser")
    public void updateUser(@RequestBody User user){
        System.out.println("UserController.updateUser");
        System.out.println("updateUser? " + user);
        Long id = user.getId();
        userService.updateById(id, user);
    }

}

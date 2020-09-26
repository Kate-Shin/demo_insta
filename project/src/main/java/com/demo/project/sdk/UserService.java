package com.demo.project.sdk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRespository userRespository;

    // 전체조회
    public List<User> findAll (){
        List<User> user = userRespository.findAll();
        return user;
    }
    
    // id 조회
    public User findById (Long id){
        Optional<User> user_opt = userRespository.findById(id);

        if(user_opt.isPresent()) {
            System.out.println(user_opt.get());
            return user_opt.get();
        }
        return null; //수정 필요
    }
    
    // 유저 등록
    public void insert (User user){
        userRespository.save(user);
    }

    // 유저 삭제
    public void deleteById (Long id){
        userRespository.deleteById(id);
    }
    
    // 유저 수정
    public void updateById(Long id, User user) {
        System.out.println("UserService.updateById");
        Optional<User> user_opt = userRespository.findById(id);
        System.out.println("User_opt??" + user_opt);
        if (user_opt.isPresent()) {
            user_opt.get().setId(user.getId());
            user_opt.get().setName(user.getName());
            user_opt.get().setNickname(user.getNickname());
            user_opt.get().setPw(user.getPw());
            user_opt.get().setDisplay_status(user.getDisplay_status());
            userRespository.save(user);
            System.out.println("user????" + user);
        }
    }


}

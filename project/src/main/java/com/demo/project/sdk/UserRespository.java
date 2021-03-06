package com.demo.project.sdk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRespository extends JpaRepository<User, Long>{

    // findBy뒤에 컬럼명을 붙여주면 이를 이용한 검색이 가능하다
    public List<User> findById(long id);

    public List<User> findByName(String name);

    //like검색도 가능
    public List<User> findByNameLike(String keyword);

}

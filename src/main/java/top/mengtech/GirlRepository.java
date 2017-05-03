package top.mengtech;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by mqm on 2017/5/3.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    public List<Girl> findByAge(Integer age);
}

package top.mengtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.mengtech.domain.Girl;

import java.util.List;

/**
 * Created by mqm on 2017/5/3.
 */
@Repository
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    public List<Girl> findByAge(Integer age);
}

package top.mengtech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.mengtech.domain.Girl;
import top.mengtech.repository.GirlRepository;

/**
 * Created by mqm on 2017/5/4.
 */
@Service
public class GirlService {
    @Autowired
    GirlRepository girlRepository;

    @Transactional
    public void twoGirl(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(21);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("BBB");
        girlB.setAge(22);
        girlRepository.save(girlB);
    }
}

package com.studyhuang.house.test;

import com.studyhuang.house.ApplicationTests;
import com.studyhuang.house.entity.db.User;
import com.studyhuang.house.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author huang1996
 * @date 2019/6/2 10:53 AM
 */
public class UserRepositoryTest extends ApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void userTest() {
        User user = userRepository.findOne(1L);
        Assert.assertEquals("wali",user.getName());
    }
}

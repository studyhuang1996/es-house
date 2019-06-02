package com.studyhuang.house.repository;

import com.studyhuang.house.entity.db.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author huang1996
 * @date 2019/6/2 11:31 AM
 */
public interface UserRepository extends JpaRepository<User,Long> {
}

package com.hason.dtp.tcc.account.dao;

import com.hason.dtp.tcc.account.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户dao
 *
 * @author Huanghs
 * @since 2.0
 * @date 2017/10/18
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 根据用户名，查询记录
     *
     * @param username 用户名
     * @return User
     */
    User findByUsername(String username);

}

package com.neuedu.controlor;

import com.neuedu.dao.UserMapper;
import com.neuedu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextControlor {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/user/{userid}" )
    public User findUser(@PathVariable Integer userid)
    {
        return userMapper.selectByPrimaryKey(userid);
    }
}

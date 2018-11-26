package com.baizhi.dao;
import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface UserDao{

	public User selectOneUser(User user);

}
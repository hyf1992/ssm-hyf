package com.whitehorse.qingzhi.service.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whitehorse.qingzhi.dao.UserMapper;
import com.whitehorse.qingzhi.entity.User;
import com.whitehorse.qingzhi.service.UserService;

@Service()
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	@Override
	public int deleteByPrimaryKey(Integer userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectByPrimaryKey(Integer userId) {
		
		//return userMapper.selectByPrimaryKey(userId);
		return sqlSessionTemplate.selectOne("selectByPrimaryKey",userId);//高性能
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

}

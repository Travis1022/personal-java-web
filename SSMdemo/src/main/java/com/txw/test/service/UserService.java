package com.txw.test.service;

import java.util.List;
import java.util.Map;

import com.txw.test.entity.UserEntity;

public interface UserService {
	public List<UserEntity> userList(Map<String, Object> map);
}

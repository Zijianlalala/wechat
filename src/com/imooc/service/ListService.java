package com.imooc.service;

import java.util.List;

import com.imooc.bean.Message;
import com.imooc.dao.MessageDao;

/**
 * 列表相关的业务功能
 * @author wuzijian
 *
 */
public class ListService {
	public List<Message> queryMessageList(String command, String description){
		return MessageDao.queryMessageList(command, description);
	}
}

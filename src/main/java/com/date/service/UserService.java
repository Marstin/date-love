package com.date.service;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.date.dao.UserDao;
import com.date.model.User;
import com.date.model.WXSession;
import com.date.serviceImpl.UserServiceImpl;
import com.google.gson.Gson;

@Service("userService")
public class UserService implements UserServiceImpl{
	
	private User u;

	@Autowired
	private UserDao userDao;
	
	public int insertUser(User u) {
		// TODO Auto-generated method stub
		return userDao.insertUser(u);
	}
	
	public User getUser(String id) {
		return userDao.selectUserById(id);
	}
	
	public int updateUser(User u) {
		return userDao.updateUser(u);
	}
	
	public List<User> queryUser(User u){
		return userDao.queryUser(u);
	}
	
	public WXSession getWXSession(String code) {
		String url = "https://api.weixin.qq.com/sns/jscode2session?appid=wxd29e501c010a127c&secret=fe392ff3ce162fb69d1daceec5962312&js_code=" + code + "&grant_type=authorization_code";
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet get = new HttpGet(url);
		WXSession session = new WXSession();
		String result = null;
		CloseableHttpResponse response = null;
		try {
            response = httpClient.execute(get);
            if(response != null && response.getStatusLine().getStatusCode() == 200)
            {
                HttpEntity entity = response.getEntity();
                result = EntityUtils.toString(entity);
            }
            session = new Gson().fromJson(result, WXSession.class);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                httpClient.close();
                if(response != null)
                {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		return session;
	}
}

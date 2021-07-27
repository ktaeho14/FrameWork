package com.my.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.my.dto.MyBoardDto;

public class MyBoardDao extends sqlMapConfig{
	
	
	
	public List<MyBoardDto> selectAll(){
		List<MyBoardDto> res = new ArrayList<MyBoardDto>();
		
		SqlSession session = null;
		
		try {
			session = getSqlSessionFactory().openSession(true);
			res = session.selectList("com.my.myboard.selectAll");
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		
		
		
		
		
		
		return res;
	}
	
	
	public MyBoardDto selectOne(int myno) {
		SqlSession session = null;
		MyBoardDto res = null;
		
		try {
			session = getSqlSessionFactory().openSession(false);
			res = session.selectOne("com.my.myboard.selectOne",myno);
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		
		return res;
	}
	
	
	
	public int insert(MyBoardDto dto) {
		SqlSession session = null;
		int res = 0;
		
		try {
			session = getSqlSessionFactory().openSession(false);
			res = session.insert("com.my.myboard.insert",dto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		
	
		
		
		
		return  res;
	}
	
	
	public int update(MyBoardDto dto) {
		SqlSession session = null;
		int res = 0;
		
		
		try {
			session = getSqlSessionFactory().openSession(false);
			res = session.update("com.my.myboard.update",dto);
			
			if(res>0) {
				session.commit();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			session.close();
		}
		return res;
	}
	
	
	public int delete(int myno) {
		SqlSession session = null;
		int res = 0;
		
		try {
			session = getSqlSessionFactory().openSession(false);
			res = session.delete("com.my.myboard.delete",myno);
			if(res>0) {
				session.commit();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			session.close();
		}
		return res;
	}
	
	
	
	
	
	
	
	
	
}

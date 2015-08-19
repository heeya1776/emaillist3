package com.bit2015.emaillist3.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.bit2015.emaillist3.vo.EmailListVo;

@Repository
public class EmailListDao {
	
	@Autowired
	SqlMapClientTemplate sqlMapClientTemplate;
	
	public List<EmailListVo> getList(){
		
		List<EmailListVo> list = sqlMapClientTemplate.queryForList("emaillist.list");
		
		return list;
		
	}
	
	public void insert(EmailListVo vo) {
			
		sqlMapClientTemplate.insert("emaillist.insert", vo);
	}
	
	public void delete(long no) {
		
		sqlMapClientTemplate.delete("emaillist.delete", no);
	}
	
	public void delete(String firstName, String lastName) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("fn", firstName);
		map.put("ln", lastName);
		
		sqlMapClientTemplate.delete("emaillist.deletebyname", map);
	}
}

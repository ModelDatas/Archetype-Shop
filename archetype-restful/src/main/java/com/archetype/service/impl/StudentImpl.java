package com.archetype.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.archetype.mapper.StudentMapper;
import com.archetype.pojo.StudentExample;
import com.archetype.pojo.StudentExample.Criteria;
import com.archetype.service.Student;

@Service
public class StudentImpl implements Student {
	
	@Autowired
	private StudentMapper sm;

	@Override
	public int selectFind(String str) {
		try {
			StudentExample example = StudentExample.class.newInstance();
			Criteria criteria= example.createCriteria();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}

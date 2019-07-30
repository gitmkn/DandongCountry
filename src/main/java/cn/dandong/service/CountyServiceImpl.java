package cn.dandong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dandong.entity.County;
import cn.dandong.mapper.CountyMapper;

@Service
public class CountyServiceImpl implements CountyService{

	@Autowired
	private CountyMapper countyMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return countyMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(County record) {
		// TODO Auto-generated method stub
		return countyMapper.insert(record);
	}

	@Override
	public County selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return countyMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<County> selectAll() {
		// TODO Auto-generated method stub
		return countyMapper.selectAll();
	}

	@Override
	public int updateByPrimaryKey(County record) {
		// TODO Auto-generated method stub
		return countyMapper.updateByPrimaryKey(record);
	}

}

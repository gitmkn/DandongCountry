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
	public int deleteByPrimaryKey(Integer cid) {
		// TODO Auto-generated method stub
		return countyMapper.deleteByPrimaryKey(cid);
	}

	@Override
	public int insert(County record) {
		// TODO Auto-generated method stub
		return countyMapper.insert(record);
	}

	@Override
	public County selectByPrimaryKey(Integer cid) {
		// TODO Auto-generated method stub
		return countyMapper.selectByPrimaryKey(cid);
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

	/**
	 * 统计区的数量
	 */
	@Override
	public int countCounty() {
		// TODO Auto-generated method stub
		return countyMapper.countCounty();
	}

}

package cn.dandong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dandong.entity.Ethnic;
import cn.dandong.mapper.EthnicMapper;

@Service
public class EthnicServiceImpl implements EthnicService{

	@Autowired
	private EthnicMapper ethnicMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer eid) {
		// TODO Auto-generated method stub
		return ethnicMapper.deleteByPrimaryKey(eid);
	}

	@Override
	public int insert(Ethnic record) {
		// TODO Auto-generated method stub
		return ethnicMapper.insert(record);
	}

	@Override
	public Ethnic selectByPrimaryKey(Integer eid) {
		// TODO Auto-generated method stub
		return ethnicMapper.selectByPrimaryKey(eid);
	}

	@Override
	public List<Ethnic> selectAll() {
		// TODO Auto-generated method stub
		return ethnicMapper.selectAll();
	}

	@Override
	public int updateByPrimaryKey(Ethnic record) {
		// TODO Auto-generated method stub
		return ethnicMapper.updateByPrimaryKey(record);
	}

}

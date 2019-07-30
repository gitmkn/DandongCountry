package cn.dandong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dandong.entity.Villagebasicinfo;
import cn.dandong.entity.Villageethnic;
import cn.dandong.mapper.VillageethnicMapper;

@Service
public class VillageethnicServiceImpl implements VillageethnicService{

	@Autowired
	private VillageethnicMapper villageethnicMapper;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return villageethnicMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Villageethnic record) {
		// TODO Auto-generated method stub
		return villageethnicMapper.insert(record);
	}

	@Override
	public Villageethnic selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return villageethnicMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Villageethnic> selectAll() {
		// TODO Auto-generated method stub
		return villageethnicMapper.selectAll();
	}

	@Override
	public int updateByPrimaryKey(Villageethnic record) {
		// TODO Auto-generated method stub
		return villageethnicMapper.updateByPrimaryKey(record);
	}

}

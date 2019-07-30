package cn.dandong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dandong.entity.Villageethnic1;

@Service
public class Villageethnic1ServiceImpl implements Villageethnic1Service{

	@Autowired
	private Villageethnic1Service villageethnic1Service;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return villageethnic1Service.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Villageethnic1 record) {
		// TODO Auto-generated method stub
		return villageethnic1Service.insert(record);
	}

	@Override
	public Villageethnic1 selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return villageethnic1Service.selectByPrimaryKey(id);
	}

	@Override
	public List<Villageethnic1> selectAll() {
		// TODO Auto-generated method stub
		return villageethnic1Service.selectAll();
	}

	@Override
	public int updateByPrimaryKey(Villageethnic1 record) {
		// TODO Auto-generated method stub
		return villageethnic1Service.updateByPrimaryKey(record);
	}

}

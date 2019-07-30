package cn.dandong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dandong.entity.Town;

@Service
public class TownServiceImpl implements TownService{

	@Autowired
	private TownService townService;
	@Override
	public int deleteByPrimaryKey(Integer tid) {
		// TODO Auto-generated method stub
		return townService.deleteByPrimaryKey(tid);
	}

	@Override
	public int insert(Town record) {
		// TODO Auto-generated method stub
		return townService.insert(record);
	}

	@Override
	public Town selectByPrimaryKey(Integer tid) {
		// TODO Auto-generated method stub
		return townService.selectByPrimaryKey(tid);
	}

	@Override
	public List<Town> selectAll() {
		// TODO Auto-generated method stub
		return townService.selectAll();
	}

	@Override
	public int updateByPrimaryKey(Town record) {
		// TODO Auto-generated method stub
		return townService.updateByPrimaryKey(record);
	}

}

package cn.dandong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dandong.entity.Villagebasicinfo;

@Service
public class VillagebasicinfoServiceImpl implements VillagebasicinfoService{

	@Autowired
	private VillagebasicinfoService villagebasicinfoService;
	@Override
	public int deleteByPrimaryKey(Integer vid) {
		// TODO Auto-generated method stub
		return villagebasicinfoService.deleteByPrimaryKey(vid);
	}

	@Override
	public int insert(Villagebasicinfo record) {
		// TODO Auto-generated method stub
		return villagebasicinfoService.insert(record);
	}

	@Override
	public Villagebasicinfo selectByPrimaryKey(Integer vid) {
		// TODO Auto-generated method stub
		return villagebasicinfoService.selectByPrimaryKey(vid);
	}

	@Override
	public List<Villagebasicinfo> selectAll() {
		// TODO Auto-generated method stub
		return villagebasicinfoService.selectAll();
	}

	@Override
	public int updateByPrimaryKey(Villagebasicinfo record) {
		// TODO Auto-generated method stub
		return villagebasicinfoService.updateByPrimaryKey(record);
	}

}

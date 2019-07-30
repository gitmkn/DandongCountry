package cn.dandong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dandong.entity.Ethnic;

@Service
public class EthnicServiceImpl implements EthnicService{

	@Autowired
	private EthnicService ethnicService;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return ethnicService.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Ethnic record) {
		// TODO Auto-generated method stub
		return ethnicService.insert(record);
	}

	@Override
	public Ethnic selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return ethnicService.selectByPrimaryKey(id);
	}

	@Override
	public List<Ethnic> selectAll() {
		// TODO Auto-generated method stub
		return ethnicService.selectAll();
	}

	@Override
	public int updateByPrimaryKey(Ethnic record) {
		// TODO Auto-generated method stub
		return ethnicService.updateByPrimaryKey(record);
	}

}

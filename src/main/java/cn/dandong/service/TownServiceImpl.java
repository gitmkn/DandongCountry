package cn.dandong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dandong.entity.Town;
import cn.dandong.mapper.TownMapper;

@Service
public class TownServiceImpl implements TownService{

	@Autowired
	private TownMapper townMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer tid) {
		// TODO Auto-generated method stub
		return townMapper.deleteByPrimaryKey(tid);
	}

	@Override
	public int insert(Town record) {
		// TODO Auto-generated method stub
		return townMapper.insert(record);
	}

	@Override
	public Town selectByPrimaryKey(Integer tid) {
		// TODO Auto-generated method stub
		return townMapper.selectByPrimaryKey(tid);
	}

	@Override
	public List<Town> selectAll() {
		// TODO Auto-generated method stub
		return townMapper.selectAll();
	}

	@Override
	public int updateByPrimaryKey(Town record) {
		// TODO Auto-generated method stub
		return townMapper.updateByPrimaryKey(record);
	}

	/**
	 * 根据区县编号查询所属的镇
	 */
	@Override
	public List<Town> selectByCid(Integer cid) {
		// TODO Auto-generated method stub
		return townMapper.selectByCid(cid);
	}

	/**
	 * 统计数量
	 */
	@Override
	public int CountTown() {
		// TODO Auto-generated method stub
		return townMapper.CountTown();
	}

	/**
	 * 根据区编号查所属镇
	 */
	@Override
	public int CountTownByCid(Integer cid) {
		// TODO Auto-generated method stub
		return townMapper.CountTownByCid(cid);
	}

}

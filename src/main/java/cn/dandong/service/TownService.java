package cn.dandong.service;

import java.util.List;

import cn.dandong.entity.Town;

public interface TownService {
	 /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table town
     *
     * @mbg.generated Sun Aug 11 13:18:45 CST 2019
     */
    int deleteByPrimaryKey(Integer tid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table town
     *
     * @mbg.generated Sun Aug 11 13:18:45 CST 2019
     */
    int insert(Town record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table town
     *
     * @mbg.generated Sun Aug 11 13:18:45 CST 2019
     */
    Town selectByPrimaryKey(Integer tid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table town
     *
     * @mbg.generated Sun Aug 11 13:18:45 CST 2019
     */
    List<Town> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table town
     *
     * @mbg.generated Sun Aug 11 13:18:45 CST 2019
     */
    int updateByPrimaryKey(Town record);
    
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table town
     *
     * @mbg.generated Sun Aug 11 13:18:45 CST 2019
     */
    List<Town> selectByCid(Integer cid);
    
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table town
     *
     * @mbg.generated Sun Aug 11 13:18:45 CST 2019
     */
    int CountTown();
    
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table town
     *
     * @mbg.generated Sun Aug 11 13:18:45 CST 2019
     */
    int CountTownByCid(Integer cid);
}
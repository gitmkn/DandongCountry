package cn.dandong.service;

import java.util.List;

import cn.dandong.entity.County;

public interface CountyService {
	 /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbg.generated Tue Jul 30 21:45:47 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbg.generated Tue Jul 30 21:45:47 CST 2019
     */
    int insert(County record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbg.generated Tue Jul 30 21:45:47 CST 2019
     */
    County selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbg.generated Tue Jul 30 21:45:47 CST 2019
     */
    List<County> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbg.generated Tue Jul 30 21:45:47 CST 2019
     */
    int updateByPrimaryKey(County record);
}
package org.yd.springdemo.dao;


public interface BaseDao<T> {

	 /**
     *
     *	根据主键删除
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *	新增
     * @mbggenerated
     */
    int insert(T record);

    /**
     *
     *	选择性新增
     * @mbggenerated
     */
    int insertSelective(T record);

    /**
     *	根据主键查询
     * @mbggenerated
     */
    T selectByPrimaryKey(Long id);

    /**
     *
     *	根据主键选择性修改
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(T record);

    /**
     *	根据主键全部修改
     * @mbggenerated
     */
    int updateByPrimaryKey(T record);
}

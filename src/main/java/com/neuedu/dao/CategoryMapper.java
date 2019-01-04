package com.neuedu.dao;

import com.neuedu.pojo.Category;
import java.util.List;

public interface CategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated
     */
    int insert(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated
     */
    Category selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated
     */
    List<Category> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Category record);
}
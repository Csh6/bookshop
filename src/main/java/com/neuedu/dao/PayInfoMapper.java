package com.neuedu.dao;

import com.neuedu.pojo.PayInfo;
import java.util.List;

public interface PayInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payinfo
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payinfo
     *
     * @mbggenerated
     */
    int insert(PayInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payinfo
     *
     * @mbggenerated
     */
    PayInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payinfo
     *
     * @mbggenerated
     */
    List<PayInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payinfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PayInfo record);
}
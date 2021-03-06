package com.alone.mymall.mgb.mapper;

import com.alone.mymall.mgb.model.OmsOrderSetting;
import com.alone.mymall.mgb.model.OmsOrderSettingExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OmsOrderSettingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Wed Dec 18 21:36:57 CST 2019
     */
    int countByExample(OmsOrderSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Wed Dec 18 21:36:57 CST 2019
     */
    int deleteByExample(OmsOrderSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Wed Dec 18 21:36:57 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Wed Dec 18 21:36:57 CST 2019
     */
    int insert(OmsOrderSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Wed Dec 18 21:36:57 CST 2019
     */
    int insertSelective(OmsOrderSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Wed Dec 18 21:36:57 CST 2019
     */
    List<OmsOrderSetting> selectByExample(OmsOrderSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Wed Dec 18 21:36:57 CST 2019
     */
    OmsOrderSetting selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Wed Dec 18 21:36:57 CST 2019
     */
    int updateByExampleSelective(@Param("record") OmsOrderSetting record, @Param("example") OmsOrderSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Wed Dec 18 21:36:57 CST 2019
     */
    int updateByExample(@Param("record") OmsOrderSetting record, @Param("example") OmsOrderSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Wed Dec 18 21:36:57 CST 2019
     */
    int updateByPrimaryKeySelective(OmsOrderSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Wed Dec 18 21:36:57 CST 2019
     */
    int updateByPrimaryKey(OmsOrderSetting record);
}
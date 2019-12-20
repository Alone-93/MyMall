package com.alone.mymall.mgb.mapper;

import com.alone.mymall.mgb.model.CmsPrefrenceArea;
import com.alone.mymall.mgb.model.CmsPrefrenceAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsPrefrenceAreaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    int countByExample(CmsPrefrenceAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    int deleteByExample(CmsPrefrenceAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    int insert(CmsPrefrenceArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    int insertSelective(CmsPrefrenceArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    List<CmsPrefrenceArea> selectByExampleWithBLOBs(CmsPrefrenceAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    List<CmsPrefrenceArea> selectByExample(CmsPrefrenceAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    CmsPrefrenceArea selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    int updateByExampleSelective(@Param("record") CmsPrefrenceArea record, @Param("example") CmsPrefrenceAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") CmsPrefrenceArea record, @Param("example") CmsPrefrenceAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    int updateByExample(@Param("record") CmsPrefrenceArea record, @Param("example") CmsPrefrenceAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    int updateByPrimaryKeySelective(CmsPrefrenceArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(CmsPrefrenceArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    int updateByPrimaryKey(CmsPrefrenceArea record);
}
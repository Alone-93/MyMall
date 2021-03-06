package com.alone.mymall.mgb.mapper;

import com.alone.mymall.mgb.model.PmsProductCategory;
import com.alone.mymall.mgb.model.PmsProductCategoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface PmsProductCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Sat Nov 09 21:37:07 CST 2019
     */
    int countByExample(PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Sat Nov 09 21:37:07 CST 2019
     */
    int deleteByExample(PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Sat Nov 09 21:37:07 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Sat Nov 09 21:37:07 CST 2019
     */
    int insert(PmsProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Sat Nov 09 21:37:07 CST 2019
     */
    int insertSelective(PmsProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Sat Nov 09 21:37:07 CST 2019
     */
    List<PmsProductCategory> selectByExampleWithBLOBs(PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Sat Nov 09 21:37:07 CST 2019
     */
    List<PmsProductCategory> selectByExample(PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Sat Nov 09 21:37:07 CST 2019
     */
    PmsProductCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Sat Nov 09 21:37:07 CST 2019
     */
    int updateByExampleSelective(@Param("record") PmsProductCategory record, @Param("example") PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Sat Nov 09 21:37:07 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") PmsProductCategory record, @Param("example") PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Sat Nov 09 21:37:07 CST 2019
     */
    int updateByExample(@Param("record") PmsProductCategory record, @Param("example") PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Sat Nov 09 21:37:07 CST 2019
     */
    int updateByPrimaryKeySelective(PmsProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Sat Nov 09 21:37:07 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(PmsProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Sat Nov 09 21:37:07 CST 2019
     */
    int updateByPrimaryKey(PmsProductCategory record);
}
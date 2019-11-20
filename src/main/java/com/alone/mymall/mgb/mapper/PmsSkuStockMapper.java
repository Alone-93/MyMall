package com.alone.mymall.mgb.mapper;

import com.alone.mymall.mgb.model.PmsSkuStock;
import com.alone.mymall.mgb.model.PmsSkuStockExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmsSkuStockMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbggenerated Mon Nov 18 22:13:52 CST 2019
     */
    int countByExample(PmsSkuStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbggenerated Mon Nov 18 22:13:52 CST 2019
     */
    int deleteByExample(PmsSkuStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbggenerated Mon Nov 18 22:13:52 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbggenerated Mon Nov 18 22:13:52 CST 2019
     */
    int insert(PmsSkuStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbggenerated Mon Nov 18 22:13:52 CST 2019
     */
    int insertSelective(PmsSkuStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbggenerated Mon Nov 18 22:13:52 CST 2019
     */
    List<PmsSkuStock> selectByExample(PmsSkuStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbggenerated Mon Nov 18 22:13:52 CST 2019
     */
    PmsSkuStock selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbggenerated Mon Nov 18 22:13:52 CST 2019
     */
    int updateByExampleSelective(@Param("record") PmsSkuStock record, @Param("example") PmsSkuStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbggenerated Mon Nov 18 22:13:52 CST 2019
     */
    int updateByExample(@Param("record") PmsSkuStock record, @Param("example") PmsSkuStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbggenerated Mon Nov 18 22:13:52 CST 2019
     */
    int updateByPrimaryKeySelective(PmsSkuStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbggenerated Mon Nov 18 22:13:52 CST 2019
     */
    int updateByPrimaryKey(PmsSkuStock record);
}
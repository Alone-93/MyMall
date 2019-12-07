package com.alone.mymall.mgb.mapper;

import com.alone.mymall.mgb.model.UmsAdminRoleRelation;
import com.alone.mymall.mgb.model.UmsAdminRoleRelationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsAdminRoleRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbggenerated Fri Dec 06 15:20:26 CST 2019
     */
    int countByExample(UmsAdminRoleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbggenerated Fri Dec 06 15:20:26 CST 2019
     */
    int deleteByExample(UmsAdminRoleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbggenerated Fri Dec 06 15:20:26 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbggenerated Fri Dec 06 15:20:26 CST 2019
     */
    int insert(UmsAdminRoleRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbggenerated Fri Dec 06 15:20:26 CST 2019
     */
    int insertSelective(UmsAdminRoleRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbggenerated Fri Dec 06 15:20:26 CST 2019
     */
    List<UmsAdminRoleRelation> selectByExample(UmsAdminRoleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbggenerated Fri Dec 06 15:20:26 CST 2019
     */
    UmsAdminRoleRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbggenerated Fri Dec 06 15:20:26 CST 2019
     */
    int updateByExampleSelective(@Param("record") UmsAdminRoleRelation record, @Param("example") UmsAdminRoleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbggenerated Fri Dec 06 15:20:26 CST 2019
     */
    int updateByExample(@Param("record") UmsAdminRoleRelation record, @Param("example") UmsAdminRoleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbggenerated Fri Dec 06 15:20:26 CST 2019
     */
    int updateByPrimaryKeySelective(UmsAdminRoleRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbggenerated Fri Dec 06 15:20:26 CST 2019
     */
    int updateByPrimaryKey(UmsAdminRoleRelation record);
}
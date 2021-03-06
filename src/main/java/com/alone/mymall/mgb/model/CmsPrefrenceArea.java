package com.alone.mymall.mgb.model;

import java.io.Serializable;

public class CmsPrefrenceArea implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_prefrence_area.id
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_prefrence_area.name
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_prefrence_area.sub_title
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    private String subTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_prefrence_area.sort
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    private Integer sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_prefrence_area.show_status
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    private Integer showStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_prefrence_area.pic
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    private byte[] pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_prefrence_area.id
     *
     * @return the value of cms_prefrence_area.id
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_prefrence_area.id
     *
     * @param id the value for cms_prefrence_area.id
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_prefrence_area.name
     *
     * @return the value of cms_prefrence_area.name
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_prefrence_area.name
     *
     * @param name the value for cms_prefrence_area.name
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_prefrence_area.sub_title
     *
     * @return the value of cms_prefrence_area.sub_title
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_prefrence_area.sub_title
     *
     * @param subTitle the value for cms_prefrence_area.sub_title
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_prefrence_area.sort
     *
     * @return the value of cms_prefrence_area.sort
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_prefrence_area.sort
     *
     * @param sort the value for cms_prefrence_area.sort
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_prefrence_area.show_status
     *
     * @return the value of cms_prefrence_area.show_status
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_prefrence_area.show_status
     *
     * @param showStatus the value for cms_prefrence_area.show_status
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_prefrence_area.pic
     *
     * @return the value of cms_prefrence_area.pic
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    public byte[] getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_prefrence_area.pic
     *
     * @param pic the value for cms_prefrence_area.pic
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Fri Dec 20 11:56:11 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", subTitle=").append(subTitle);
        sb.append(", sort=").append(sort);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", pic=").append(pic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
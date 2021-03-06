package com.alone.mymall.dao;

import com.alone.mymall.mgb.model.OmsOrderOperateHistory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单操作记录自定义Dao
 */
@Mapper
public interface OmsOrderOperateHistoryDao {
   int insertList(@Param("list") List<OmsOrderOperateHistory> orderOperateHistoryList);
}

package com.rtx.zhongxing.mybatis.mapper.orders;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.rtx.zhongxing.mybatis.entity.orders.MidOrderDetailEntity;
import com.rtx.zhongxing.mybatis.entity.orders.MidOrderEntity;
import com.rtx.zhongxing.mybatis.entity.orders.OrderDetailEntity;
import com.rtx.zhongxing.mybatis.entity.orders.OrderEntity;
import com.rtx.zhongxing.mybatis.mapper.SqlProvider;

@Mapper
public interface OrderMapper {

	/**
	 * 将奇门下发的入库单写入中间表
	 * @return
	 */
//	@Insert("")
	@InsertProvider(type = SqlProvider.class,method = "insert")
	int addMidOrder(MidOrderEntity entity);

	/**
	 * 将奇门下发的入库单明细写入中间表
	 * @return
	 */
//	@Insert("")
	@InsertProvider(type = SqlProvider.class,method = "insert")
	int addMidOrderDetail(MidOrderDetailEntity midOrderdetailentity);

	/**
	 * 获取待写入wms中间表数据
	 * @return
	 */
//	@Select("")
	@InsertProvider(type = SqlProvider.class,method = "queryByCondition")
	List<MidOrderEntity> queryMidOrder(MidOrderEntity entity);

	/**
	 * 获取待写入wms中间表数据
	 * @return
	 */
//	@Select("")
	@InsertProvider(type = SqlProvider.class,method = "queryByCondition")
	List<MidOrderDetailEntity> queryMidOrderDetail(MidOrderDetailEntity entity);



	/**
	 * 更新中间表状态
	 * @return
	 */
//	@Update("")
	@InsertProvider(type = SqlProvider.class,method = "updStatusSql")
	int updStatus(MidOrderEntity entity);

	/**
	 * 判断是否存在
	 * @param externOrderkey
	 * @return
	 */
	@Select("select count(*) from Order where externOrderkey = #{externOrderkey}")
	int existsByExternOrderkey(@Param("externOrderkey")String externOrderkey);

	/**
	 * 将入库但数据写入wms
	 * @return
	 */
//	@Insert("")
	@InsertProvider(type = SqlProvider.class,method = "insert")
	int addOrder(OrderEntity entity);

	/**
	 * 将入库单明细数据写入wms
	 * @return
	 */
//	@Insert("")
	@InsertProvider(type = SqlProvider.class,method = "insert")
	int addOrderDetail(OrderDetailEntity entity);


}

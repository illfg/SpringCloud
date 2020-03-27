package org.yuanqi.seataorder12311.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.yuanqi.seataorder12311.entity.Order;

@Mapper
public interface OrderMapper {

    @Update("UPDATE t_order SET state=#{state} WHERE id=#{id}")
    public void UpdateOrder(Order order);

    @Select("SELECT * FROM t_order WHERE id=#{id}")
    public Order SeleteOrder(int id);

    @Insert("INSERT INTO t_order(user_id,produce_id,count,cash,state} VALUES (#{user_id},#{produce_id},#{count},#{cash},#{state}))")
    public void InsertOrder(Order order);
}

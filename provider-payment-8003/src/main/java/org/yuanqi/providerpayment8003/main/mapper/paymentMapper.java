package org.yuanqi.providerpayment8003.main.mapper;


import entity.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface paymentMapper {

    @Insert("INSERT INTO payment(content) VALUES(#{content})")
    public int create(Payment payment);

    @Select("SELECT * FROM payment WHERE id = #{id}")
    public Payment getPaymentById(Long id);
}

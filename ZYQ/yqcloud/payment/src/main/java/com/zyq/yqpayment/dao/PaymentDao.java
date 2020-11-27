package com.zyq.yqpayment.dao;


import com.zyq.yqpayment.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id")Long id);
    public int setSerialById(Payment payment);
    public int deleteById(Payment payment);

}

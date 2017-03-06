//package com.seckill.dao;
//
//import com.seckill.entity.SuccessKilled;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import javax.annotation.Resource;
//
///**
// * Created by Donnie on 2017/3/2.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:spring/spring-dao.xml")
//
//public class SuccessKilledDaoTest {
//    @Resource
//    private SuccessKilledDao successKilledDao;
//    @Test
//    public void insertSuccessKilled() throws Exception {
//        successKilledDao.insertSuccessKilled(1000L,15062288092L);
//    }
//
//    @Test
//    public void queryByIdWithSeckill() throws Exception {
//        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(1000L,15062288092L);
//        System.out.println(successKilled);
//    }
//
//}
package com.seckill.dao;

import com.seckill.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Donnie on 2017/3/2.
 */

/**
 * Junit和Spring整合
 */
@RunWith(SpringJUnit4ClassRunner.class)
/**
 * 读取配置文件
 */
@ContextConfiguration({"classpath:spring/spring-dao.xml"})

public class SeckillDaoTest {
    //先进行dao的注入
    @Resource
    private SeckillDao seckillDao;

    @Test
    public void reduceNumber() throws Exception {
        long id = 1000;
        Date date = new Date();
        int updateCount = seckillDao.reduceNumber(id,date);

        System.out.println(updateCount);
    }

    @Test
    public void queryByID() throws Exception {
        long id = 1000;
        Seckill seckill = seckillDao.queryByID(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }

    @Test
    public void queryAll() throws Exception {
        List<Seckill> seckillList = new ArrayList<Seckill>();
        seckillList = seckillDao.queryAll(0, 100);
        for (Seckill seckill: seckillList) {
            System.out.println(seckill);
        }
    }

}
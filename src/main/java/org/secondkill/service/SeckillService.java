package org.secondkill.service;

import org.secondkill.dto.Exposer;
import org.secondkill.dto.SeckillExecution;
import org.secondkill.entity.Seckill;
import org.secondkill.exception.RepeatKillException;
import org.secondkill.exception.SeckillCloseException;
import org.secondkill.exception.SeckillException;

import java.util.List;

/**
 * 业务接口，站在 “使用者” 的角度来实现
 * 三个方面：方法定义粒度，参数，返回类型(return 类型/异常)
 * Created by GBC on 2017/3/18.
 */
public interface SeckillService {
    /**
     * 返回所有的秒杀商品记录
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 查询单个秒杀商品记录
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * 秒杀开启时，输出秒杀接口的地址
     * 否则输出系统时间 和 秒杀时间
     * @param seckillId
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀操作
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
        throws SeckillException,RepeatKillException,SeckillCloseException;


    /**
     * 通过存储过程执行秒杀操作
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckillProcedure(long seckillId, long userPhone, String md5)
            throws SeckillException,RepeatKillException,SeckillCloseException;
}

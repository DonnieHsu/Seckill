package com.seckill.exception;

/**
 * Created by Donnie on 2017/3/2.
 */

import com.seckill.dto.SeckillExecution;

/**
 * 重复秒杀异常(运行期异常）
 */
public class RepeatKillException extends SeckillException{

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}

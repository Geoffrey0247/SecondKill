package org.secondkill.exception;

/**
 * 异常父类:秒杀异常，继承RuntimeException
 * Created by GBC on 2017/3/18.
 */
public class SeckillException extends RuntimeException{

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}

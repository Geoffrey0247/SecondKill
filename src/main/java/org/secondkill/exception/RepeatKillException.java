package org.secondkill.exception;

/**重复秒杀异常(运行期异常)
 * Created by GBC on 2017/3/18.
 */
public class RepeatKillException extends SeckillException{

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}

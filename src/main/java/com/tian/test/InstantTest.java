package com.tian.test;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author tianchengbei
 * @since 2019-11-25
 */
public class InstantTest {

    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("now:"+now);
        System.out.println(now.toEpochMilli());
        //通过这种方式获取的时间戳与北京时间相差8个时区
        Instant now1 = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8));
        System.out.println("now1:"+now1);
        //Instant获取long类型的10位秒数、13位毫秒数
        Instant now2 = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8));
        System.out.println("秒数:"+now2.getEpochSecond());
        System.out.println("毫秒数:"+now2.toEpochMilli());

        long l = System.currentTimeMillis();
        System.out.println(l);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd : HH:mm:ss");
        String dd = format.format(new Date(l));
        System.out.println(dd);
    }

}

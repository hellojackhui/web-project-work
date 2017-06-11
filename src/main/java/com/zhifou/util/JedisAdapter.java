package com.zhifou.util;

/**
 * Created by JackHui on 2017/6/11.
 */
public class JedisAdapter {
    public static void print(int index,Object obj)
    {
        System.out.println(String.format("%d,%s",index,obj.toString()));
    }
    public  static  void  main(String[] args)
    {
        Jedis jedis=new Jedis();
        Jedis.flushDB();
    }

}

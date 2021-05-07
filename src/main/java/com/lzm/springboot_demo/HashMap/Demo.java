package com.lzm.springboot_demo.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年05月06日 14:07
 */
public class Demo {

    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,1);
        System.out.println(map.get(1));
    }
}

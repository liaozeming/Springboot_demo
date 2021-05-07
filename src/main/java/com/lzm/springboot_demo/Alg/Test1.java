package com.lzm.springboot_demo.Alg;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年05月07日 9:18
 */
public class Test1 {
    public static void main(String[] args) {
      int  n = 4, start = 3;
      Test1 test1=new Test1();
        int i = test1.xorOperation(n, start);
        System.out.println(i);
    }
    public int xorOperation(int n, int start) {
        int[] res=new int[n];
        for (int i = 0; i < n; i++) {
            res[i]=start+2*i;
        }
        int temp=res[0];
        for (int i = 1; i <n ; i++) {
            temp^=res[i];
        }
        return temp;
    }
}

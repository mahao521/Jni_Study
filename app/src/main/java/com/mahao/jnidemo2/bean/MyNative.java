package com.mahao.jnidemo2.bean;

/**
 * Created by Penghy on 2017/8/14.
 */


public class MyNative {

    public MyNative(){

    }

    //C语言访问java函数
    public native String accessCachString();
    public int  getString(){

        return 3;
    }

    //c语言访问基本类型数组
    public native void getInArray(int[] arr);

    public native int[][] initInt2DArray(int size);
    public native String[] initStringArray(int size);
    public native void localRef();
    public native void createGlobalRef();
    public native String getglobalRef();
    public native void delGlobalRef();
    public native void exception();
    public native void cached();
    public native static void  initIDs();

}

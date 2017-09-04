package com.mahao.jnidemo2;

/**
 * Created by Penghy on 2017/8/8.
 */

import java.util.Date;

/**
 *   java和C调用 ：
 *   JNI ----> java native Interface;  类似代理，类似多态；
 *
 *   1 ： 编写native方法和类A； javac com/mahao/jnidemo2/GetfFromC
 *
 *   2 ： 生成类A的.h的头文件。  javah -jni com.mahao.jnidemo2.GetFromC
 *
 *   3 ： 编写C文件，实现.h文件的native方法。  需要到jdk/include文件复制jni.h和jni_md.h
 *
 *   4 ： 生成dll文件；    从visual studio拷贝文件到工程目录下
 *
 *   5 ： 加载dll库文件    System.loadLibrary("JniDemo3");
 *
 *   6 ：调用类A的方法；
 *
 */
public class GetFromC {

    public  int age = 4;

    public  static int times = 200;

    public GetFromC(){

    }

    public GetFromC(int age){

        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getTimes() {
        return times;
    }

    public static void setTimes(int times) {
        GetFromC.times = times;
    }

    public static native String dynamicLog();

    public static native  int  staticLog(int a,int b);

    public native int getSubmit(int a);

    public native String commonField();

    public native void staticField();


    public static native int stringAndInt(int a,String b);


    public static  native Date getUserCalendar();


    public int printfNum(int b){

        for(int i = 0; i < 10 ; i++){

            System.out.print(i+"...");
        }

      return b;
    }


    public static int  printStaticNum(int b){

        for(int i = 0; i < b ; i++){

            System.out.print(i+"..."+(i+1));
            String string = new String();
        }
        return b;
    }


}

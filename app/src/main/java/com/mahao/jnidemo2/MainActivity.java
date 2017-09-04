package com.mahao.jnidemo2;

import android.support.v7.app.AppCompatActivity;

import com.mahao.jnidemo2.bean.MyNative;

import java.lang.reflect.Array;
import java.util.Arrays;

import static com.mahao.jnidemo2.GetFromC.dynamicLog;
import static com.mahao.jnidemo2.GetFromC.getTimes;
import static com.mahao.jnidemo2.GetFromC.getUserCalendar;
import static com.mahao.jnidemo2.GetFromC.stringAndInt;

public class MainActivity {

    static{

        System.loadLibrary("JniDemo3");
    }

/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn = (Button) findViewById(R.id.btn_demo2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn.setText(dynamicLog());
            }
        });
    }*/

   public static void main(String[] args){

       System.out.println(dynamicLog());

       GetFromC getFromC = new GetFromC();
       System.out.println(getFromC.getSubmit(99));

       System.out.println(getFromC.commonField());

       getFromC.staticField();
       System.out.println(getTimes()+"...");

       getUserCalendar();

       stringAndInt(1,"233");

       //C语言访问java的getString();  -----抛出异常
       MyNative myTive = new MyNative();
       myTive.accessCachString();

       //C语言访问java数组
       int[] arr = new int[]{1,5,3,2,6,2,9};
       myTive.getInArray(arr);
       System.out.print(Arrays.toString(arr));

   }
}

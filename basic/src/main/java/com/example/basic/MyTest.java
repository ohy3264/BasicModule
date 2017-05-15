package com.example.basic;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;

/**
 * Created by darong on 2017. 5. 15..
 */

public class MyTest {
    public void showMyToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

}

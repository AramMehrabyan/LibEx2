package com.am.lavr.aram.aramexlib;

import android.content.Context;
import android.widget.Toast;

public class ToastEfect {

    public void showExToast(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}

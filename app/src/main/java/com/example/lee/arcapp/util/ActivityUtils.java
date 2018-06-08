package com.example.lee.arcapp.util;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public final class ActivityUtils {
    private ActivityUtils() {

    }

    public static void startActivity(Context context, int position) {
        Toast.makeText(context, position + "", Toast.LENGTH_SHORT).show();
        switch (position) {
            case 0:
            default:
                break;
        }
    }

    public static void startActivity(Context context, Class clazz) {
        Intent intent = new Intent(context, clazz);
        context.startActivity(intent);
    }
}

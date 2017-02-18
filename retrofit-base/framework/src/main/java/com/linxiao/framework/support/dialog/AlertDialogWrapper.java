package com.linxiao.framework.support.dialog;

import android.content.Context;
import android.content.DialogInterface;

import com.linxiao.framework.BaseApplication;

/**
 * 应用内消息通知封装
 * Created by LinXiao on 2016-11-25.
 */
public class AlertDialogWrapper {

    private AlertDialogWrapper() {}

    public static AlertDialogBuilder createAlertDialogBuilder() {
        return createAlertDialogBuilder(BaseApplication.getAppContext());
    }

    public static AlertDialogBuilder createAlertDialogBuilder(Context context) {
        return new AlertDialogBuilder(context);
    }

    /**
     * show an alert dialog with simple message and positive button
     * */
    public static void showAlertDialog(String message) {
        createAlertDialogBuilder()
        .setMessage(message)
        .show();
    }

    /**
     * show alert dialog with simple message,
     * click event of positive button is configurable
     * */
    public static void showAlertDialog(String message, DialogInterface.OnClickListener positiveListener) {
        createAlertDialogBuilder()
        .setMessage(message)
        .setPositiveButton(positiveListener)
        .show();
    }

    /**
     * show alert dialog with simple message,
     * click event of positive button and negative button are configurable
     * */
    public static void showAlertDialog(String message, DialogInterface.OnClickListener positiveListener,
                                       DialogInterface.OnClickListener negativeListener) {
        createAlertDialogBuilder()
        .setMessage(message)
        .setPositiveButton(positiveListener)
        .setNegativeButton(negativeListener)
        .show();
    }

}

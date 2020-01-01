package com.wyp.myapplication;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by wuyoupeng on 2020/1/1 22:35
 */
public class LogUtils {
    /**
     * µ÷ÊÔ
     */
    public static void d(String msg){
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        StringBuffer toStringBuffer = new StringBuffer("[").append(
                Thread.currentThread().getName()).append(" | ").append(
                traceElement.getFileName()).append(" | ").append(
                traceElement.getLineNumber()).append(" | ").append(
                traceElement.getMethodName()).append("()").append("]");
        String TAG = toStringBuffer.toString();
        Log.d(TAG,msg);

    }
    public static void d(Context context, String msg){
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        StringBuffer toStringBuffer = new StringBuffer("[").append(
                Thread.currentThread().getName()).append(" | ").append(
                traceElement.getFileName()).append(" | ").append(
                traceElement.getLineNumber()).append(" | ").append(
                traceElement.getMethodName()).append("()").append("]");
        String TAG = toStringBuffer.toString();
        Log.d(TAG,msg);
        writeToFile(context, TAG+"  "+msg);
    }

    public static void v(String msg){
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        StringBuffer toStringBuffer = new StringBuffer("[").append(
                Thread.currentThread().getName()).append(" | ").append(
                traceElement.getFileName()).append(" | ").append(
                traceElement.getLineNumber()).append(" | ").append(
                traceElement.getMethodName()).append("()").append("]");
        String TAG = toStringBuffer.toString();
        Log.v(TAG,msg);

    }

    public static void v(Context context, String msg){
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        StringBuffer toStringBuffer = new StringBuffer("[").append(
                Thread.currentThread().getName()).append(" | ").append(
                traceElement.getFileName()).append(" | ").append(
                traceElement.getLineNumber()).append(" | ").append(
                traceElement.getMethodName()).append("()").append("]");
        String TAG = toStringBuffer.toString();
        Log.v(TAG,msg);
        writeToFile(context, TAG+"  "+msg);

    }

    public static void w(String msg){
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        StringBuffer toStringBuffer = new StringBuffer("[").append(
                Thread.currentThread().getName()).append(" | ").append(
                traceElement.getFileName()).append(" | ").append(
                traceElement.getLineNumber()).append(" | ").append(
                traceElement.getMethodName()).append("()").append("]");
        String TAG = toStringBuffer.toString();
        Log.w(TAG,msg);

    }

    public static void w(Context context, String msg){
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        StringBuffer toStringBuffer = new StringBuffer("[").append(
                Thread.currentThread().getName()).append(" | ").append(
                traceElement.getFileName()).append(" | ").append(
                traceElement.getLineNumber()).append(" | ").append(
                traceElement.getMethodName()).append("()").append("]");
        String TAG = toStringBuffer.toString();
        Log.w(TAG,msg);
        writeToFile(context, TAG+"  "+msg);

    }

    public static void e(String msg){
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        StringBuffer toStringBuffer = new StringBuffer("[").append(
                Thread.currentThread().getName()).append(" | ").append(
                traceElement.getFileName()).append(" | ").append(
                traceElement.getLineNumber()).append(" | ").append(
                traceElement.getMethodName()).append("()").append("]");
        String TAG = toStringBuffer.toString();
        Log.e(TAG,msg);
    }

    public static void e(Context context, String msg){
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        StringBuffer toStringBuffer = new StringBuffer("[").append(
                Thread.currentThread().getName()).append(" | ").append(
                traceElement.getFileName()).append(" | ").append(
                traceElement.getLineNumber()).append(" | ").append(
                traceElement.getMethodName()).append("()").append("]");
        String TAG = toStringBuffer.toString();
        Log.e(TAG,msg);
        writeToFile(context, TAG+"  "+msg);
    }

    public static void i(String msg) {
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        StringBuffer toStringBuffer = new StringBuffer("[").append(
                Thread.currentThread().getName()).append(" | ").append(
                traceElement.getFileName()).append(" | ").append(
                traceElement.getLineNumber()).append(" | ").append(
                traceElement.getMethodName()).append("()").append("]");
        String TAG = toStringBuffer.toString();
        Log.i( TAG,msg);
    }

    public static void i(Context context, String msg) {
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        StringBuffer toStringBuffer = new StringBuffer("[").append(
                Thread.currentThread().getName()).append(" | ").append(
                traceElement.getFileName()).append(" | ").append(
                traceElement.getLineNumber()).append(" | ").append(
                traceElement.getMethodName()).append("()").append("]");
        String TAG = toStringBuffer.toString();
        Log.i( TAG,msg);
        writeToFile(context, TAG+"  "+msg);
    }

    private static void writeToFile(Context context, String content) {

        File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS), "mike.txt");

        if (!file.exists()) {
            //file.delete();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileWriter fw = null;
        try {
            fw = new FileWriter(file,true);
            fw.write("\n"+content);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

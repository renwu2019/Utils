package com.example.jobhelper.utils;

import android.util.Log;

import com.example.jobhelper.common.Constants;

/**
 * Created by wuyoupeng on 2019/7/29 18:15
 */
public class LogUtils {
    /**
     * ต๗สิ
     */
    public static void d(String msg){
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        StringBuffer toStringBuffer = new StringBuffer("[").append(
                traceElement.getFileName()).append(" | ").append(
                traceElement.getLineNumber()).append(" | ").append(
                traceElement.getMethodName()).append("()").append("]");
        String TAG = toStringBuffer.toString();
        Log.d(Constants.DEBUG_TAG+TAG,msg);
    }

    public static void v(String msg){
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        StringBuffer toStringBuffer = new StringBuffer("[").append(
                traceElement.getFileName()).append(" | ").append(
                traceElement.getLineNumber()).append(" | ").append(
                traceElement.getMethodName()).append("()").append("]");
        String TAG = toStringBuffer.toString();
        Log.v(TAG,msg);

    }

    public static void w(String msg){
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        StringBuffer toStringBuffer = new StringBuffer("[").append(
                traceElement.getFileName()).append(" | ").append(
                traceElement.getLineNumber()).append(" | ").append(
                traceElement.getMethodName()).append("()").append("]");
        String TAG = toStringBuffer.toString();
        Log.w(TAG,msg);

    }

    public static void e(String msg){
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        StringBuffer toStringBuffer = new StringBuffer("[").append(
                traceElement.getFileName()).append(" | ").append(
                traceElement.getLineNumber()).append(" | ").append(
                traceElement.getMethodName()).append("()").append("]");
        String TAG = toStringBuffer.toString();
        Log.e(TAG,msg);
    }

    public static void i(String msg) {
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        StringBuffer toStringBuffer = new StringBuffer("[").append(
                traceElement.getFileName()).append(" | ").append(
                traceElement.getLineNumber()).append(" | ").append(
                traceElement.getMethodName()).append("()").append("]");
        String TAG = toStringBuffer.toString();
        Log.i( TAG,msg);
    }


}
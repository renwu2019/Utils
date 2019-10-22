package com.comtech.rbt.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;
import com.comtech.rbt.R;

/**
 * Created by Administrator on 2019/8/22.
 */

@SuppressLint("AppCompatCustomView")
public class CustomEditText extends EditText {

    private Context mContext;
    private Drawable drawableDelete;

    public CustomEditText(Context context) {
        super(context);
        mContext = context;
        init();
    }

    public CustomEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        init();
    }

    public CustomEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        init();
    }

    private void init() {
        drawableDelete = mContext.getResources().getDrawable(R.drawable.x);
        drawableDelete.setBounds(0, 0, 30, 30);
        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.length()>0) setIcon(true);
                else setIcon(false);
                //setIcon(length() > 0);
            }
        });
        //setIcon(false);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (drawableDelete != null && event.getAction() == MotionEvent.ACTION_UP) {
            //获取触摸点坐标
            int eventX = (int) event.getRawX();
            int eventY = (int) event.getRawY();
            //获取整个EdtiText的可见区域
            Rect rect = new Rect();
            getGlobalVisibleRect(rect);
            //修改区域为图标区域
            rect.left = rect.right - 80;
            if (rect.contains(eventX, eventY)) {
                //触摸点在图标区域，清空文本
                setText("");
            }
        }
        return super.onTouchEvent(event);
    }

    //根据是否有内容来绘制图标
    private void setIcon(boolean visible) {
        Drawable right = visible ? drawableDelete : null;
        setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], right, getCompoundDrawables()[3]);
    }
}

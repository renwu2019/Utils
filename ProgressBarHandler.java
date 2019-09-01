public class ProgressBarHandler {
    private ProgressBar mProgressBar;
    private Context mContext;

    public ProgressBarHandler(Context context) {
        mContext = context;

        ViewGroup layout = (ViewGroup) ((Activity) context).findViewById(android.R.id.content).getRootView();

        mProgressBar = new ProgressBar(context, null, android.R.attr.progressBarStyleLarge);
        mProgressBar.setIndeterminate(true);

        RelativeLayout.LayoutParams params = new
                RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

        RelativeLayout rl = new RelativeLayout(context);

        rl.setGravity(Gravity.CENTER);
        rl.addView(mProgressBar);

        layout.addView(rl, params);

        hide();
    }

    public void show() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    public void hide() {
        mProgressBar.setVisibility(View.INVISIBLE);
    }
}
/*
    //创建进度条，p可定义到当前页面，根据需要p.hide
    private void createProgressBar(){
        //整个Activity布局的最终父布局,参见参考资料
        FrameLayout rootFrameLayout=(FrameLayout) findViewById(android.R.id.content);
        FrameLayout.LayoutParams layoutParams=
                new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity=Gravity.CENTER;
        ProgressBar p=new ProgressBar(mContext);
        p.setLayoutParams(layoutParams);
        p.setVisibility(View.VISIBLE);
        rootFrameLayout.addView(p);
    }

    //创建进度条对话框，可以双击页面其他部分取消进度状态，p可定义到当前页面，根据需要p.hide
    private void createProgressDialog(){
        mContext=this;
        ProgressDialog p =new ProgressDialog(mContext);
        p.setMessage("请稍等...");
        p.show();
    }

*/


/*
//配合登录，注意线程的切换
mLoginBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        //测试用途，省去验证
        mLoginProgressBar.setVisibility(View.VISIBLE);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mLoginProgressBar.setVisibility(View.GONE);
                            toMainActivity();
                        }
                    });

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
});

*/




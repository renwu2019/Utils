    //图片闪烁
    private void setFlickerAnimation(ImageView iv) {
        final Animation animation = new AlphaAnimation(1, 0);
        animation.setDuration(750);//闪烁时间间隔
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
        animation.setRepeatCount(Animation.INFINITE);
        animation.setRepeatMode(Animation.REVERSE);
        iv.setAnimation(animation);
    }

package com.herokuapp.tastyapp.tasty;

public interface ParseOnLoadingListener {
    public void onLoadingStart(boolean showSpinner);

    public void onLoadingFinish();
}

package com.appmon.cloudtest;

/**
 * Created by pacmancoder on 20.10.16.
 */

public class TaskInfo {

    private boolean mChecked;
    private String mText;

    TaskInfo(String text, boolean checked) {
        mChecked = checked;
        mText = text;
    }

    public String getText() {
        return mText;
    }

    public boolean isChecked() {
        return mChecked;
    }

    public void setChecked(boolean checked) {
        this.mChecked = checked;
    }

    public void setmText(String text) {
        this.mText = text;
    }
}
package com.example.horacechan.opencvtest;

/**
 * Created by HoraceChan on 2017/1/15.
 */

public class OpenCVHelper {
    static {
        System.loadLibrary("OpenCV");
    }
    public static native int[] gray(int[] buf, int w, int h);
}

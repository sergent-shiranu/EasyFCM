package com.trung.fcm.library;

import android.content.Context;

/**
 * Created by mrgiua on 24/05/2016.
 */
public class FCMManager {
    /**
     * Class instance
     */
    private static FCMManager instance = null;

    /**
     * Holding Context
     */
    private Context mContext;

    /**
     * FCM Listener
     */
    private FCMListener mFCMListener;

    /**
     * Private constructor and call init()
     * @param mContext
     */
    private FCMManager(Context mContext) {
        this.mContext = mContext;
    }

    /**
     * Singleton instance method
     * @param context
     * @return
     */
    public static FCMManager getInstance(Context context){
        if(instance == null)
            instance = new FCMManager(context);
        return instance;
    }

    /**
     * Register listener
     * @param fcmListener
     */
    public void registerListener(FCMListener fcmListener) {
        this.mFCMListener = fcmListener;
    }

    /**
     * Unregister listener. No longer need to notify.
     */
    public void unRegisterListener() {
        mFCMListener = null;
    }
}

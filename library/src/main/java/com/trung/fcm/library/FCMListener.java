package com.trung.fcm.library;

import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by mrgiua on 24/05/2016.
 */
public interface FCMListener {
    /**
     * Called when device is registered to FCM servers and received token
     * @param deviceToken
     */
    void onDeviceRegisted(String deviceToken);

    /**
     * Called when downstream message receive by device.
     * @param remoteMessage
     */
    void onMessage(RemoteMessage remoteMessage);

    /**
     * Called when device is unable to google play service.
     */
    void onPlayServiceError();
}

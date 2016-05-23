package com.trung.fcm.library;

import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by mrgiua on 24/05/2016.
 */
public class FCMIdListenerService extends FirebaseInstanceIdService {
    private static final String TAG = FCMIdListenerService.class.getSimpleName();

    /**
     * Called if InstanceID token is updated. This may occur if the security of
     * the previous token had been compromised. Note that this is called when the InstanceID token
     * is initially generated so this is where you would retrieve the token.
     */
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
    }
}

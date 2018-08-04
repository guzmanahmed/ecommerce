package com.gengefasta.androidecommerce.services;

import com.google.firebase.iid.FirebaseInstanceIdService;

import com.gengefasta.androidecommerce.constant.ConstantValues;
import com.gengefasta.androidecommerce.network.StartAppRequests;


/**
 * FirebaseInstanceIdService Gets FCM instance ID token from Firebase Cloud Messaging Server
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    
    
    //*********** Called whenever the Token is Generated or Refreshed ********//
    
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
    
        if (ConstantValues.DEFAULT_NOTIFICATION.equalsIgnoreCase("fcm")) {
    
            StartAppRequests.RegisterDeviceForFCM(getApplicationContext());
        
        }
        
    }
    
}

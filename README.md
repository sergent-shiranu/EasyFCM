Easy FireBase Cloud Notification
================================

* [Overview](#overview)
* [Features](#features)
* [Prerequisites](#prerequisites)
* [Usage](#usage)
    * [Message](#message)
    * [Topic](#topic)
* [References](#references)

# Overview
Google has replaced GCM by FCM.
This library was based on [FastGCM](https://github.com/iammert/FastGCM) and hosted in `jCenter`
# Features
* Receive Firebase push messages
* Subscribe and receive Firebase push messages by topic

# Prerequisites
Add the FCM dependency to your app-level build.gradle file

```à
apply plugin: 'com.google.gms.google-services'

dependencies {
    compile 'ccom.trung.fcm.library:EasyFCM:0.0.1'
}
```
Note that the version 1.0 use the version 9.0.2 of Firebase, if you include the library as a submodule you can define it in `gradle.properties` file.


Add the FCM dependency to your app-level build.gradle file

```
dependencies {
    classpath 'com.google.gms:google-services:3.0.0'
}
```

Download your `google-services.json` and copy to your main application. This file contains the information allowing identify your project. You can download this file by following step by step the [project Setting up](https://console.firebase.google.com/) 

# Usage

## Message

If your want to listen messages from your Activity, there are 3 ways : 

* [MainActivity](https://github.com/trung-nguyen/EasyFCM/blob/master/app/src/main/java/com/trung/easyfcm/MainActivity.java)
 
By registering your device to GCM server
  
```java
//call this onCreate() or onResume()
FCMManager.getInstance(this).registerListener(this);
  
//call this onDestroy()
FCMManager.getInstance(this).unRegisterListener();
```


Implement the interface `FCMListener`
```java
public class MainActivity extends Activity implements FCMListener{

  @Override
  public void onDeviceRegisted(String token) {
  
  }

  @Override
  public void onMessage(RemoteMessage remoteMessage) {
  
  }

  @Override
  public void onPlayServiceError() {
  
  }
}
```

* [SampleActivity](https://github.com/trung-nguyen/EasyFCM/blob/master/app/src/main/java/com/trung/easyfcm/SampleActivity.java)

By extending your `Activity` to [FCMActivity](https://github.com/trung-nguyen/EasyFCM/blob/master/library/src/main/java/com/trung/fcm/library/FCMActivity.java)

* [SampleCompatActivity]

By extending your your `Activity` to [FCMCompatActivity](https://github.com/trung-nguyen/EasyFCM/blob/master/library/src/main/java/com/trung/fcm/library/FCMCompatActivity.java)

## Topic

Subscription and Un-subscription to/from Topics. (after onDeviceRegistered())
```java
FCMManager.getInstance(this).subscribeTopic("topic");
FCMManager.getInstance(this).unSubscribeTopic("topic");

```

# References

[Developers Google GCM](https://developers.google.com/cloud-messaging/)
[Firebase doc](http://firebase.google.com/docs/cloud-messaging/)

License
--------


    Copyright 2016 Trung Nguyen.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

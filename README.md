Easy FireBase Cloud Notification
================================

* [Overview](#overview)
* [Features](#features)
* [Prerequisites](#prerequisites)
* [Usage](#usage)
* [References](#references)

# Overview
# Features
* Receive Firebase push messages
* Subscribe and receive Firebase push messages by topic

# Prerequisites
Add the FCM dependency to your app-level build.gradle file

```
apply plugin: 'com.google.gms.google-services'

dependencies {
    compile 'com.github.trungnguyen:EasyFCM:1.0'
}
```
Note that the version 1.0 use the version 9.0.0 of Firebase, you can define it in `gradle.properties` file


Add the FCM dependency to your app-level build.gradle file

```
dependencies {
    classpath 'com.google.gms:google-services:3.0.0'
}
```

Download your `google-services.json` and copy to your main application. This file contains the information allowing identify your project. You can download this file by following step by step the [project Setting up](https://console.firebase.google.com/) 

# Usage
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
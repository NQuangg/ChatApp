package com.quang.chatapp.fragment;

import com.quang.chatapp.notification.MyResponse;
import com.quang.chatapp.notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-type:application/json",
                    "Authorization:key=AAAAkFcAm38:APA91bEZGtpG9HB9mdJwTbQMXJ6HiayemYDkBi69pah9CKf6g8ktRrfQh065IeeCfEe1M5K4wVkcJ97w2cmxD62FyVl2PtIKrLcfNR9-uVAuQQEJ8arz-RqUSI7fo5fVgdTrv5uBeVDx"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}

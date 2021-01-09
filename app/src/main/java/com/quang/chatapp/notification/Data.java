package com.quang.chatapp.notification;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Data {
    private String user;
    private int icon;
    private String body;
    private String title;
    private String sender;
}

package com.example.phonebook.notification.strategy;

import com.example.phonebook.event.NewUser;

public class UserNotificationManager {

    private final UserNotificationStrategy strategy;

    public UserNotificationManager(UserNotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public NotificationResult notifyUser(NewUser.NewUserEvent event) {
        return strategy.notifyUser(event);
    }
}

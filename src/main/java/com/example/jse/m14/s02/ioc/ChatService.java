package com.example.jse.m14.s02.ioc;

import java.util.HashMap;
import java.util.Map;

public class ChatService implements Service {
    private static Map<String, Callback> users = new HashMap<>();

    public ChatService(String user, Callback callback) {
        users.put(user, callback);
    }

    @Override
    public void send(String sender, String recipient, String message) {
        System.out.printf("Service send message from %s to %s%n", sender, recipient);

        new Thread(() -> {
            try {
                Thread.sleep(666);
            } catch (InterruptedException e) {
                System.out.println("Some important job in the service can't be accomplished!");
            }

            if (users.containsKey(recipient)) {
                users.get(recipient).callback(recipient, message);
            } else {
                System.err.printf("User %s not found%n", recipient);
            }
        }).start();
    }
}

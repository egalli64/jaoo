package com.example.jse.m14.s02.ioc;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.FutureTask;

public class ChatService {
    private static Map<String, ChatCallback> users = new HashMap<>();

    public ChatService(String user, ChatCallback client) {
        users.put(user, client);
    }

    public void send(String sender, String recipient, String message) {
        System.out.printf("Service send message from %s to %s%n", sender, recipient);

        FutureTask<Void> task = new FutureTask<Void>(() -> {
            // after some time ...
            try {
                Thread.sleep(666);
            } catch (InterruptedException e) {
                System.out.println("Some important job in the service can't be accomplished!");
            }

            if (!users.containsKey(recipient)) {
                System.err.printf("User %s not found%n", recipient);
            } else {
                users.get(recipient).callback(sender, message);
            }

            return null;
        });

        new Thread(task).start();
    }
}

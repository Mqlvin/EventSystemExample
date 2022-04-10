package me.henry;

import me.henry.event.Priority;
import me.henry.event.SubscribeEvent;
import me.henry.event.impl.KeyPressEvent;

public class EventListenerTest {
    @SubscribeEvent
    public void onKeyPress(KeyPressEvent event) {
        System.out.println("No priority modifier... " + event.getKey());
    }

    @SubscribeEvent(priority = Priority.HIGHEST)
    public void onKeyPressFirst(KeyPressEvent event) {
        System.out.println("HIGHEST priority modifier, event called... " + event.getKey());
    }

    @SubscribeEvent(priority = Priority.LOWEST)
    public void onKeyPressLast(KeyPressEvent event) {
        System.out.println("LOWEST priority modifier... " + event.getKey());
    }
}

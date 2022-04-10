package me.henry;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import me.henry.event.bus.EventBus;

public class Main {
    public static final EventBus EVENT_BUS = new EventBus();

    public static void main(String[] args) {
        try {
            GlobalScreen.registerNativeHook();
        } catch(NativeHookException e) {
            e.printStackTrace();
        }
        GlobalScreen.addNativeKeyListener(new KeyboardListener());

        EVENT_BUS.register(new EventListenerTest());
    }
}

/*
    Uses the JNativeHook library to listen to keyboard inputs. It calls the KeyPressEvent when an input is made.
 */

package me.henry;

import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import me.henry.event.impl.KeyPressEvent;

public class KeyboardListener implements NativeKeyListener {
    public void nativeKeyPressed(NativeKeyEvent event) {
        Main.EVENT_BUS.call(new KeyPressEvent(event.getKeyCode()));
    }
}

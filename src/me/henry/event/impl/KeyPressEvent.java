/*
    An example event, which stores a keycode parameter.
 */

package me.henry.event.impl;

import me.henry.event.Event;

public class KeyPressEvent extends Event {
    private final int key;

    public KeyPressEvent(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }
}

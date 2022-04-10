/*
    This object contains values used by the event bus.
    Every single method is stored in the EventListener object.
 */

package me.henry.event.bus;

import me.henry.event.Priority;

import java.lang.reflect.Method;

public class EventListener {
    private Object listener;
    private Method method;
    private Priority priority;

    public EventListener(Object listener, Method method, Priority priority) {
        this.listener = listener;
        this.method = method;
        this.priority = priority;
    }

    public Object getListener() {
        return listener;
    }

    public Method getMethod() {
        return method;
    }

    public Priority getPriority() {
        return priority;
    }
}

/*
    A superclass for events.
    Also has built-in cancel function.
 */

package me.henry.event;

public class EventCancelable extends Event {
    private Boolean canceled = false;

    public void cancel() {
        canceled = true;
    }

    public Boolean isCanceled() {
        return canceled;
    }
}

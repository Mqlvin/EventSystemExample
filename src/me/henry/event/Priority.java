/*
    This affects the order methods are invoked when an event is called.
 */

package me.henry.event;

public enum Priority {
    LOWEST(4),
    LOW(3),
    NORMAL(2),
    HIGH(1),
    HIGHEST(0);

    private final int level;
    Priority(int level) {
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }
}

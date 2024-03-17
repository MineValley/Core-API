package minevalley.core.api.events;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import minevalley.core.api.users.OnlineUser;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * This event gets called when a user is released from prison.
 */
@Getter
@RequiredArgsConstructor
@SuppressWarnings("unused")
public class UserPrisonReleaseEvent extends Event {

    public static final HandlerList HANDLER_LIST = new HandlerList();
    private final OnlineUser user;

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }
}
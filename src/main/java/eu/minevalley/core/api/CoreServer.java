package eu.minevalley.core.api;

import eu.minevalley.core.api.database.*;
import eu.minevalley.core.api.helpers.*;
import eu.minevalley.core.api.utils.*;
import eu.minevalley.core.api.utils.gui.*;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import java.sql.ResultSet;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

public interface CoreServer {

    int scheduleSyncRepeatingTask(long period, long delay, BukkitRunnable runnable);

    int scheduleSyncRepeatingTask(long period, long delay, Runnable runnable);

    int scheduleAsyncRepeatingTask(long period, long delay, Runnable runnable);


    int scheduleSyncDelayedTask(long delay, BukkitRunnable runnable);

    int scheduleSyncDelayedTask(long delay, Runnable runnable);

    int scheduleSyncDelayedTask(BukkitRunnable runnable);

    int scheduleSyncDelayedTask(Runnable runnable);

    int scheduleAsyncDelayedTask(long delay, Runnable runnable);

    int scheduleAsyncDelayedTask(Runnable runnable);


    BukkitTask runTask(Runnable runnable);

    BukkitTask runTaskAsync(Runnable runnable);


    BukkitTask runTaskTimer(long period, long delay, BukkitRunnable runnable);

    BukkitTask runTaskTimer(long period, long delay, Runnable runnable);

    BukkitTask runTaskTimerAsync(long period, long delay, BukkitRunnable runnable);

    BukkitTask runTaskTimerAsync(long period, long delay, Runnable runnable);


    BukkitTask runTaskLater(long delay, BukkitRunnable runnable);

    BukkitTask runTaskLater(long delay, Runnable runnable);

    BukkitTask runTaskLaterAsync(long delay, BukkitRunnable runnable);

    BukkitTask runTaskLaterAsync(long delay, Runnable runnable);


    boolean isCurrentlyRunning(int taskId);

    void cancelTask(int taskId);



    void registerListeners(Listener listener);

    //

    CountdownHelper getCountdownHelper();

    EventHelper getEventHelper();

    RabbitHelper getRabbitHelper();

    //

    DatabaseEntry databaseEntry(String tableName, ResultSet resultSet, int index);

    DatabaseEntry databaseEntry(String tableName, Value searchValue);

    DatabaseEntryCollection databaseEntryCollection(String tableName, List<DatabaseEntry> entries);

    DatabaseEntryCollection databaseEntryCollection(String tableName, Value searchValue);

    DatabaseTable databaseTable(String tableName);


    //

    GuiBuilder gui(Inventory inventory);

    GuiBuilder gui(int size);

    GuiItem guiItem(ItemStack itemStack, Consumer<Player> consumer);

    Countdown createCountdown();

    ItemBuilder createItem(Material material);

    ItemBuilder createItem(Material material, short data);

    ItemBuilder createItem(Player player);

    ItemBuilder createItem(UUID uniqueId);

    ItemBuilder createItem(String url);
}
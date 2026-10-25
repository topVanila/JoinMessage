package me.breaksmp.joinmessage;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoinMessage extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("JoinMessage enabled!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        var player = event.getPlayer();

        player.sendMessage("qq посмешище");

        getServer().getScheduler().runTaskLater(this, () -> {
            if (player.isOnline()) {
                player.sendMessage(ChatColor.RED + "ТЫ ПОСМЕШИЩЕ!");
            }
        }, 60L);
    }
}

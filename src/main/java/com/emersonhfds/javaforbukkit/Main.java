package com.emersonhfds.javaforbukkit;

import com.emersonhfds.javaforbukkit.commands.CommandMenuFly;
import com.emersonhfds.javaforbukkit.commands.JavaForBukkit;
import org.bukkit.plugin.java.JavaPlugin;
public class Main extends JavaPlugin {
    private static JavaPlugin plugin;

    public void onEnable() {
        getLogger().info("§aPlugin Iniciado!");
        saveConfig();
        plugin = this;
        getCommand("fly").setExecutor(new JavaForBukkit());
        getCommand("menu").setExecutor(new CommandMenuFly());
    }

    public static JavaPlugin getInstance() {
        return plugin;
    }

}
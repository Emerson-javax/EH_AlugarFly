package com.emersonhfds.javaforbukkit.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class JavaForBukkit extends JavaPlugin {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args ) {
        Player player = (Player)sender;

        if(command.getName().equalsIgnoreCase("fly")) {
            if(player.hasPermission("eh_alugarfly.fly")){
                player.sendMessage("§aFly Habilitado");
                player.setFlying(true);
            } else {
                player.sendMessage("§cVocê não tem permissão para isso!");
            }
        }
        return true;

    }
}
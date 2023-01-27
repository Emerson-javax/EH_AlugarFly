package com.emersonhfds.javaforbukkit.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandMenuFly extends JavaPlugin {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player)sender;

        if (command.getName().equalsIgnoreCase("menu")) {
            if (player.hasPermission("eh_alugarfly.use.menu")) {
                player.sendMessage("§aMenu Habilitado");
                player.getInventory().addItem(new ItemStack(Material.DIAMOND));
            } else {
                player.sendMessage("§cVocê não tem permissão para isso!");
            }
        }
        return true;
    }
}
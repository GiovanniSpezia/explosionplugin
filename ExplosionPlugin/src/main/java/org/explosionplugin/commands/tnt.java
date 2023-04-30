package org.explosionplugin.commands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.block.Block;

public class tnt implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("tnt")) {

            if (sender instanceof Player) {
                Player player = (Player) sender;

                Location loc = player.getLocation();

                Block block = loc.getBlock().getRelative(0, -1, 0);

                if (block.getType().isSolid()) {
                    Location tntLoc = loc.clone().add(1, 0, 0);

                    tntLoc.getBlock().setType(Material.TNT);
                    Bukkit.broadcastMessage(player.getName() + " §6placed a TNT!");

                    return true;

                } else {
                    player.sendMessage("§4You can't place TNT");

                    return true;
                }
            }
        }

        return false;
    }
}

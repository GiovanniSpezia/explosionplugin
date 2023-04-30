package org.explosionplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
public class explosion implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("explosion")) {

            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.getWorld().createExplosion(player.getLocation(), 4.0f);

                sender.sendMessage("§2§lExplosion successfully performed at the player " + player.getName());

                return true;

            } else {
                sender.sendMessage("§4Command can only be executed by one player");

                return false;
            }
        }

        return false;
    }
}

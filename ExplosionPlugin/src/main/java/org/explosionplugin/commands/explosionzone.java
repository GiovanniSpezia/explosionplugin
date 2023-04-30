package org.explosionplugin.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandExecutor;
public class explosionzone implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("Explosionzone")) {

            if (sender instanceof Player) {
                Player player = (Player) sender;

                if (args.length == 3) {
                    try {
                        int x = Integer.parseInt(args[0]);
                        int y = Integer.parseInt(args[1]);
                        int z = Integer.parseInt(args[2]);

                        Location location = new Location(player.getWorld(), x, y, z);
                        player.getWorld().createExplosion(location, 4.0f);
                        player.sendMessage("§2§lExplosion created at " + x + ", " + y + ", " + z);

                        return true;
                    } catch (NumberFormatException e) {
                        player.sendMessage("§4Invalid coordinates.");

                        return false;
                    }
                } else {
                    player.sendMessage("§4Usage -> /Explosionzone <x> <y> <z>");

                    return false;
                }
            } else {
                sender.sendMessage("§4This command can only be executed by a player.");

                return false;
            }
        }
        return false;
    }
}

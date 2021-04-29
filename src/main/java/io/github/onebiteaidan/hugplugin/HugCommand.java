package io.github.onebiteaidan.hugplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HugCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length > 0) {
                final Player target = Bukkit.getPlayerExact(args[0]);
                if (target instanceof Player) {
                    Bukkit.getServer().broadcastMessage(ChatColor.GRAY + "[" + ChatColor.GOLD + "" + ChatColor.BOLD + "TownyTTV" + ChatColor.GRAY + "] " + ChatColor.YELLOW +  ((Player)sender).getDisplayName() + ChatColor.GOLD + " just hugged " + ChatColor.YELLOW + target.getDisplayName() + ChatColor.GOLD + "! How Cute ^w^");
                } else {
                    player.sendMessage(ChatColor.RED + "You can only hug a player that is online.");
                }
            }
        } else {
            System.out.println("Sorry this command doesn't work via console right now!");
        }
        return false;
    }
}


package io.github.onebiteaidan.hugplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GroupHugCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String Label, String args[]) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Bukkit.getServer().broadcastMessage(ChatColor.GRAY + "[" + ChatColor.DARK_GREEN + "Onebite.Dev" + ChatColor.GRAY + "] " + ChatColor.GREEN +  ((Player)sender).getDisplayName() + " just initiated a group hug! AWWWW!" );
        } else {
            System.out.println(ChatColor.RED + "Sorry this command isn't available via console yet!");
        }
        return false;
    }
}

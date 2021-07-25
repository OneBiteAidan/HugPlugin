package io.github.onebiteaidan.hugplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GroupHugCommand implements CommandExecutor {

    private HugPlugin main;

    public GroupHugCommand(HugPlugin main) {
        this.main = main;
    }

    public static String colorize(String message)
    {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String Label, String args[]) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            String prefix = main.getConfig().getString("prefix");
            String hugMessage = main.getConfig().getString("hug-message").replace("%player%", player.getName());

            Bukkit.getServer().broadcastMessage(colorize(prefix + hugMessage ));
        } else {
            System.out.println(ChatColor.RED + "Sorry this command isn't available via console yet!");
        }
        return false;
    }
}

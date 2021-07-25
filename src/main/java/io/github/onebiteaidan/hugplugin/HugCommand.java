package io.github.onebiteaidan.hugplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HugCommand implements CommandExecutor {



    private HugPlugin main;

    public HugCommand(HugPlugin main) {
        this.main = main;
    }

    public static String colorize(String message)
    {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length > 0) {

                final Player target = Bukkit.getPlayerExact(args[0]);

                //Imports from Config.yml
                String prefix = main.getConfig().getString("prefix");
                String hugMessage = main.getConfig().getString("hug-message").replace("%player%", player.getName()).replace("%target%", target.getDisplayName());

                if (target instanceof Player) {
                    Bukkit.getServer().broadcastMessage(colorize(prefix + hugMessage));
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


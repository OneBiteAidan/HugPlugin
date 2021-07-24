package io.github.onebiteaidan.hugplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class HugPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("COMMENCE THE HUGGING!");

        this.saveDefaultConfig();
        this.saveConfig();

        getCommand("hug").setExecutor(new HugCommand(this));
        getCommand("grouphug").setExecutor(new GroupHugCommand(this));
    }
}

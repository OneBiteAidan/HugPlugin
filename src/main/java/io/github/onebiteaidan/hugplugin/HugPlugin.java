package io.github.onebiteaidan.hugplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class HugPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("COMMENCE THE HUGGING!");

        getCommand("hug").setExecutor(new HugCommand());
        getCommand("grouphug").setExecutor(new GroupHugCommand());
    }
}

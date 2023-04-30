package org.explosionplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.explosionplugin.commands.explosion;
import org.explosionplugin.commands.explosionzone;
import org.explosionplugin.commands.tnt;

public final class ExplosionPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Plugin Online");

        this.getCommand("explosion").setExecutor(new explosion());
        this.getCommand("explosionzone").setExecutor(new explosionzone());
        this.getCommand("tnt").setExecutor(new tnt());
    }

    @Override
    public void onDisable() {
        System.out.println("Plugin Offline");
    }
}

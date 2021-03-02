package hu.biglev.ship;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private Main instance;

    @Override
    public void onEnable() {
        instance = this;

    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public Main getInstance() {
        return instance;
    }
}

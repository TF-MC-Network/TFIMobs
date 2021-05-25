package net.teamfekker.mobs;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;

public class Main extends JavaPlugin {
	
	FileConfiguration config = this.getConfig();
	public static Main plugin;
	
	@Override
	public void onEnable() {;
		plugin = this;
    	config.addDefault("zombieHealth", 35.0);
    	config.addDefault("skeletonHealth", 35.0);
    	config.addDefault("spiderHealth", 35.0);
    	config.addDefault("huskHealth", 35.0);
    	config.addDefault("drownedHealth", 35.0);
    	config.addDefault("zombieDmg", 8.0);
    	config.addDefault("spiderDmg", 6.0);
    	config.addDefault("huskDmg", 8.0);
    	config.addDefault("downedDmg", 10.0);
   	 	config.addDefault("endermanDmg", 15.0);
		config.options().copyDefaults(true);
		saveConfig();
		
		Bukkit.getPluginManager().registerEvents(new ListenerClass(), this);
		Bukkit.getPluginCommand("tfmobs").setExecutor(new net.teamfekker.mobs.ReloadCommand());
	}
}
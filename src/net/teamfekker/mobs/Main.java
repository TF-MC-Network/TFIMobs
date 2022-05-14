package net.teamfekker.mobs;

import org.bukkit.plugin.java.JavaPlugin;

import net.teamfekker.mobs.commands.BossTestCommand;
import net.teamfekker.mobs.listeners.MobBuff;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;

public class Main extends JavaPlugin {
	
	FileConfiguration config = this.getConfig();
	public static Main plugin;
	
	@Override
	public void onEnable() {
   	 	plugin = this;
   	 	config();
		Bukkit.getPluginManager().registerEvents(new MobBuff(), this);
		Bukkit.getPluginManager().registerEvents(new BossTestCommand(), this);
		Bukkit.getPluginCommand("tfmobs").setExecutor(new net.teamfekker.mobs.commands.ReloadCommand());
		Bukkit.getPluginCommand("bossspawn").setExecutor(new net.teamfekker.mobs.commands.BossTestCommand());
	}
	
	
	
	public void config() {
    	config.addDefault("zombieHealth", 35.0);
    	config.addDefault("skeletonHealth", 35.0);
    	config.addDefault("spiderHealth", 35.0);
    	config.addDefault("huskHealth", 35.0);
    	config.addDefault("drownedHealth", 35.0);
    	config.addDefault("piglinHealth", 40.0);
    	config.addDefault("bruteHealth", 75.0);
    	config.addDefault("hoglinHealth", 32.0);
    	config.addDefault("witherHealth", 40.0);
    	config.addDefault("zombieDmg", 8.0);
    	config.addDefault("spiderDmg", 6.0);
    	config.addDefault("huskDmg", 8.0);
    	config.addDefault("drownedDmg", 10.0);
   	 	config.addDefault("endermanDmg", 15.0);
   	 	config.addDefault("piglinDmg", 16.0);
   	 	config.addDefault("bruteDmg", 24.0);
   	 	config.addDefault("hoglinDmg", 18.0);
   	 	config.addDefault("witherDmg", 22.0);
   	 	
		config.options().copyDefaults(true);
		saveConfig();
		
	}
	
}
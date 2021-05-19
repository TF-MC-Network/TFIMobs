package net.teamfekker.mobs;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;

public class Main extends JavaPlugin {
	

	
	
	
	
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new ListenerClass(), this);
	}
}

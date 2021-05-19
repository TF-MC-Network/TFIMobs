package net.teamfekker.mobs;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

public class ReloadCommand implements CommandExecutor {
    private FileConfiguration config;
    private Main plugin;
    
	public ReloadCommand(Main plugin) {
		this.plugin = plugin;
		this.config = plugin.getConfig();
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("tfmobs")) {
			if(args[0].equalsIgnoreCase("reload")) {
				plugin.reloadConfig();
			} else {
				sender.sendMessage(ChatColor.RED + "Invalid arguements, please type /help tfmobs");
			}
		}
		return false;
	}
}

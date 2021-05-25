package net.teamfekker.mobs;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("tfmobs")) {
			if(args[0].equalsIgnoreCase("reload")) {
				Main.plugin.reloadConfig();
				sender.sendMessage("Config reloaded");
				return false;
			} else {
				sender.sendMessage(ChatColor.RED + "Invalid arguements, please type /help tfmobs");
			}
		}
		return false;
	}
}

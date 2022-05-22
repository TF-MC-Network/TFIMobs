package net.teamfekker.mobs.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import net.minecraft.server.v1_16_R3.WorldServer;
import net.teamfekker.mobs.boss.TestBoss;

public class BossTestCommand implements Listener, CommandExecutor {
	
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("bossspawn")) {
			if(!(sender instanceof Player)) {
				Bukkit.getLogger().info("You must be a player todo this.");
				return false;
			}
			
			TestBoss tb = new TestBoss("Boss", 20, 180, 240);
			Player player = (Player) sender;
			Location l = player.getLocation();
			World world = player.getWorld();
			
			
		}
		return true;
	}
}

package net.teamfekker.mobs.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.Listener;

public class BossTestCommand implements Listener, CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("bossspawn")) {
			if(!(sender instanceof Player)) {
				Bukkit.getLogger().info("You must be a player todo this.");
				return false;
			}
			
            sender.sendMessage("§6§lMOBS: §fStart");
			Player p = (Player) sender;
			LivingEntity mob = (LivingEntity)p.getWorld().spawnEntity(p.getLocation(), EntityType.ZOMBIE);
            Zombie z = (Zombie)mob;
            z.setCustomName("§cBoss Mob");
            z.setCustomNameVisible(true);
            z.setBaby(false); // zombie is babe? = false
            z.setMaxHealth(500);
            z.setHealth(500);
            sender.sendMessage("§6§lMOBS: §fMob custom spawned!");
		}
		return true;
	}
}

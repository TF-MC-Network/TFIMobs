package net.teamfekker.mobs;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class ListenerClass implements Listener{

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onSpawn(CreatureSpawnEvent event) {
		double zombieHealth = Main.plugin.getConfig().getDouble("zombieHealth");
		double skeletonHealth = Main.plugin.getConfig().getDouble("skeletonHealth");
		double spiderHealth = Main.plugin.getConfig().getDouble("spiderHealth");
		double huskHealth = Main.plugin.getConfig().getDouble("huskHealth");
		double drownedHealth = Main.plugin.getConfig().getDouble("drownedHealth");

		if (event.getEntity().getType().equals(EntityType.ZOMBIE)) {
			event.getEntity().setMaxHealth(zombieHealth);
			event.getEntity().setHealth(zombieHealth);
		}
		if (event.getEntity().getType().equals(EntityType.SKELETON)) {
			event.getEntity().setMaxHealth(35);
			event.getEntity().setHealth(35);
		}
		if (event.getEntity().getType().equals(EntityType.SPIDER)) {
			event.getEntity().setMaxHealth(35);
			event.getEntity().setHealth(35);
		}
		if (event.getEntity().getType().equals(EntityType.CAVE_SPIDER)) {
			event.getEntity().setMaxHealth(35);
			event.getEntity().setHealth(35);
		}
		if (event.getEntity().getType().equals(EntityType.HUSK)) {
			event.getEntity().setMaxHealth(35);
			event.getEntity().setHealth(35);
		}
		if (event.getEntity().getType().equals(EntityType.DROWNED)) {
			event.getEntity().setMaxHealth(35);
			event.getEntity().setHealth(35);
		}
		else {
			event.setCancelled(false);
		}
			
		
	}
	
	@EventHandler
	public void entityDamageEvent(EntityDamageByEntityEvent event) {
		double zombieDmg = Main.plugin.getConfig().getDouble("zombieDmg");
		double spiderDmg = Main.plugin.getConfig().getDouble("spiderDmg");
		double huskDmg = Main.plugin.getConfig().getDouble("huskDmg");
		double drownedDmg = Main.plugin.getConfig().getDouble("drownedDmg");
		double endermanDmg = Main.plugin.getConfig().getDouble("endermanDmg");
		
		if(event.getDamager().getType().equals(EntityType.ZOMBIE)) {
			event.setDamage(8);
		}
		if(event.getDamager().getType().equals(EntityType.SPIDER)) {
			event.setDamage(6);
		}
		if(event.getDamager().getType().equals(EntityType.CAVE_SPIDER)) {
			event.setDamage(6);
		}
		if(event.getDamager().getType().equals(EntityType.DROWNED)) {
			event.setDamage(8);
		}
		if(event.getDamager().getType().equals(EntityType.HUSK)) {
			event.setDamage(10);
		}
		if(event.getDamager().getType().equals(EntityType.ENDERMAN)) {
			event.setDamage(14);
		}
		if(event.getDamager() instanceof Player) {
			event.setCancelled(false);
		}
	}
}







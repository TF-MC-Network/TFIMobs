package net.teamfekker.mobs;

import org.bukkit.Server;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class ListenerClass implements Listener {

	public static Server plugin;
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onSpawn(CreatureSpawnEvent event) {
		if (event.getEntity().getType().equals(EntityType.ZOMBIE)) {
			event.getEntity().setMaxHealth(35);
			event.getEntity().setHealth(35);
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
			event.setDamage(15);
		}
		if(event.getDamager() instanceof Player) {
			event.setCancelled(false);
		}
	}
}







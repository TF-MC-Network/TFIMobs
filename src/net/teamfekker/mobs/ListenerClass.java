package net.teamfekker.mobs;

import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import net.teamfekker.mobs.Main;

public class ListenerClass implements Listener {

    private FileConfiguration config;
    private Main plugin;
	public ListenerClass(Main plugin) {
		this.plugin = plugin;
		this.config = plugin.getConfig();
	}
	
	//pulling variables from config
	double zombieHealth = config.getDouble("zombieHealth");
	double skeletonHealth = config.getDouble("skeletonHealth");
	double spiderHealth = config.getDouble("spiderHealth");
	double huskHealth = config.getDouble("huskHealth");
	double drownedHealth = config.getDouble("drownedHealth");
	double zombieDmg = config.getDouble("zombieDmg");
	double spiderDmg = config.getDouble("spiderDmg");
	double huskDmg = config.getDouble("huskDmg");
	double drownedDmg = config.getDouble("drownedDmg");
	double endermanDmg = config.getDouble("endermanDmg");
	

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onSpawn(CreatureSpawnEvent event) {
		if (event.getEntity().getType().equals(EntityType.ZOMBIE)) {
			event.getEntity().setMaxHealth(zombieHealth);
			event.getEntity().setHealth(zombieHealth);
		}
		if (event.getEntity().getType().equals(EntityType.SKELETON)) {
			event.getEntity().setMaxHealth(skeletonHealth);
			event.getEntity().setHealth(skeletonHealth);
		}
		if (event.getEntity().getType().equals(EntityType.SPIDER)) {
			event.getEntity().setMaxHealth(spiderHealth);
			event.getEntity().setHealth(spiderHealth);
		}
		if (event.getEntity().getType().equals(EntityType.CAVE_SPIDER)) {
			event.getEntity().setMaxHealth(spiderHealth);
			event.getEntity().setHealth(spiderHealth);
		}
		if (event.getEntity().getType().equals(EntityType.HUSK)) {
			event.getEntity().setMaxHealth(huskHealth);
			event.getEntity().setHealth(huskHealth);
		}
		if (event.getEntity().getType().equals(EntityType.DROWNED)) {
			event.getEntity().setMaxHealth(drownedHealth);
			event.getEntity().setHealth(drownedHealth);
		}
		else {
			event.setCancelled(false);
		}
			
		
	}
	
	@EventHandler
	public void entityDamageEvent(EntityDamageByEntityEvent event) {
		if(event.getDamager().getType().equals(EntityType.ZOMBIE)) {
			event.setDamage(zombieDmg);
		}
		if(event.getDamager().getType().equals(EntityType.SPIDER)) {
			event.setDamage(spiderDmg);
		}
		if(event.getDamager().getType().equals(EntityType.CAVE_SPIDER)) {
			event.setDamage(spiderDmg);
		}
		if(event.getDamager().getType().equals(EntityType.DROWNED)) {
			event.setDamage(drownedDmg);
		}
		if(event.getDamager().getType().equals(EntityType.HUSK)) {
			event.setDamage(huskDmg);
		}
		if(event.getDamager().getType().equals(EntityType.ENDERMAN)) {
			event.setDamage(endermanDmg);
		}
		if(event.getDamager() instanceof Player) {
			event.setCancelled(false);
		}
	}
}







package net.teamfekker.mobs.listeners;

import java.util.HashMap;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Piglin;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.projectiles.ProjectileSource;

import net.teamfekker.mobs.Main;

public class MobBuff implements Listener{

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onSpawn(CreatureSpawnEvent event) {
		double zombieHealth = Main.plugin.getConfig().getDouble("zombieHealth");
		double skeletonHealth = Main.plugin.getConfig().getDouble("skeletonHealth");
		double spiderHealth = Main.plugin.getConfig().getDouble("spiderHealth");
		double huskHealth = Main.plugin.getConfig().getDouble("huskHealth");
		double drownedHealth = Main.plugin.getConfig().getDouble("drownedHealth");
		double piglinHealth = Main.plugin.getConfig().getDouble("piglinHealth");
		double bruteHealth = Main.plugin.getConfig().getDouble("bruteHealth");
		double hoglinHealth = Main.plugin.getConfig().getDouble("hoglinHealth");
		double witherHealth = Main.plugin.getConfig().getDouble("witherHealth");

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
		if (event.getEntity().getType().equals(EntityType.PIGLIN)) {
			event.getEntity().setMaxHealth(piglinHealth);
			event.getEntity().setHealth(piglinHealth);
		}
		if (event.getEntity().getType().equals(EntityType.PIGLIN)) {
			event.getEntity().setMaxHealth(bruteHealth);
			event.getEntity().setHealth(bruteHealth);
		}
		if (event.getEntity().getType().equals(EntityType.HOGLIN)) {
			event.getEntity().setMaxHealth(hoglinHealth);
			event.getEntity().setHealth(hoglinHealth);
		}
		if (event.getEntity().getType().equals(EntityType.WITHER_SKELETON)) {
			event.getEntity().setMaxHealth(witherHealth);
			event.getEntity().setHealth(witherHealth);
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
		double piglinDmg = Main.plugin.getConfig().getDouble("piglinDmg");
		double bruteDmg = Main.plugin.getConfig().getDouble("bruteDmg");
		double hoglinDmg = Main.plugin.getConfig().getDouble("hoglinDmg");
		double witherDmg = Main.plugin.getConfig().getDouble("witherDmg");
		
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
		if(event.getDamager().getType().equals(EntityType.PIGLIN)) {
			event.setDamage(piglinDmg);
		}
		if(event.getDamager().getType().equals(EntityType.PIGLIN_BRUTE)) {
			event.setDamage(bruteDmg);
		}
		if(event.getDamager().getType().equals(EntityType.HOGLIN)) {
			event.setDamage(hoglinDmg);
		}
		if(event.getDamager().getType().equals(EntityType.WITHER_SKELETON)) {
			event.setDamage(witherDmg);
		}
		if(event.getDamager() instanceof Player) {
			event.setCancelled(false);
		}
		if(event.getDamager() instanceof Arrow) {
			ProjectileSource src = ((Arrow) event.getDamager()).getShooter();
			Player player = (Player) event.getEntity();
			if(src instanceof Skeleton ) {
				player.damage(6);
			}
			if(src instanceof Piglin) {
				player.damage(6);
			}
		}
	}
	
}







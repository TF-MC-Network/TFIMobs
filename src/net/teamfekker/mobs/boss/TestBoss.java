package net.teamfekker.mobs.boss;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;

import net.minecraft.server.v1_16_R3.EntityTypes;
import net.minecraft.server.v1_16_R3.EntityZombie;
import net.minecraft.server.v1_16_R3.GenericAttributes;

public class TestBoss extends EntityZombie {
	
	private final String name;
	private final double dmg;
	private final double xp;
	private final double health;
	
	public TestBoss(String name, double dmg, double xp, double health) {
		super(EntityTypes.ZOMBIE, ((CraftWorld) Bukkit.getWorld("world")).getHandle());
		this.name = name;
		this.dmg = dmg;
		this.xp = xp;
		this.health = health;
		
		this.getAttributeInstance(GenericAttributes.FOLLOW_RANGE).setValue(11);
		this.getAttributeInstance(GenericAttributes.MAX_HEALTH).setValue(health);
		this.getAttributeInstance(GenericAttributes.ATTACK_DAMAGE).setValue(dmg);
	}
	
	
	
	
	

}

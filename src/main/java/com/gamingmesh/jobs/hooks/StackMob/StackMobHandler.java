package com.gamingmesh.jobs.hooks.StackMob;

import org.bukkit.entity.LivingEntity;
import org.bukkit.plugin.java.JavaPlugin;

import uk.antiperson.stackmob.StackMob;
import uk.antiperson.stackmob.entity.StackEntity;

public class StackMobHandler {

    public boolean isStacked(LivingEntity entity) {
        return getPlugin().getEntityManager().isStackedEntity(entity);
    }

    public StackEntity getStackEntity(LivingEntity entity) {
        return getPlugin().getEntityManager().getStackEntity(entity);
    }

    public StackMob getPlugin() {
        return JavaPlugin.getPlugin(StackMob.class);
    }
}

package com.dixydust.mccourse.events;

import com.dixydust.mccourse.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.apache.logging.log4j.LogManager;

import java.awt.event.ItemEvent;
import java.util.Collection;

public class ModEvents {
    @SubscribeEvent
    public void onCopperedEntity(AttackEntityEvent event){
        if(event.getPlayer().getHeldItemMainhand().getItem() == ModItems.COPPER_SWORD.get()) {
            if(event.getTarget().isAlive()){
                LivingEntity target = (LivingEntity)event.getTarget();
                if(target instanceof Entity){
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.GLOWING, 600));

                    if(!player.world.isRemote()){
                        String msg = TextFormatting.LIGHT_PURPLE + "I made them gay lmao";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }
    @SubscribeEvent
    public void onCopperedEntityDrops(LivingDropsEvent event){
        LivingEntity entity = event.getEntityLiving();

        if(entity instanceof Entity){
            World world = entity.getEntityWorld();
            Collection<ItemEntity> drops = event.getDrops();

            LogManager.getLogger().debug(entity.getActivePotionEffects());

            if(entity.isPotionActive(Effects.GLOWING)){
                drops.add(new ItemEntity(world, entity.getPosX(), entity.getPosY(), entity.getPosZ(),
                        new ItemStack(Items.BARRIER)));
            }
        }
    }
}

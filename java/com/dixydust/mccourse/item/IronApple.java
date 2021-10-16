package com.dixydust.mccourse.item;

import com.dixydust.mccourse.MCCourseMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class IronApple extends Item {
    public IronApple(){
        super(new Properties().group(MCCourseMod.ENDER_MOD)
                .food(new Food.Builder()
                        .hunger(8)
                        .saturation(2f)
                        .effect(() -> new EffectInstance(Effects.ABSORPTION, 2500, 3), 1f)
                        .effect(() -> new EffectInstance(Effects.REGENERATION, 2500, 3), 1f)
                        .setAlwaysEdible()
                        .build()));
    }
}

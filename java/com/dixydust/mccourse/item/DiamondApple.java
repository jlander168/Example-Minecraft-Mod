package com.dixydust.mccourse.item;

import com.dixydust.mccourse.MCCourseMod;
import com.dixydust.mccourse.util.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class DiamondApple extends Item {
    public DiamondApple(){
        super(new Properties().group(MCCourseMod.ENDER_MOD)
                .food(new Food.Builder()
                        .hunger(12)
                        .saturation(3f)
                        .effect(() -> new EffectInstance(Effects.ABSORPTION, 10000, 5), 1f)
                        .effect(() -> new EffectInstance(Effects.REGENERATION, 10000, 5), 1f)
                        .effect(() -> new EffectInstance(Effects.RESISTANCE, 10000, 5), 1f)
                        .effect(() -> new EffectInstance(Effects.STRENGTH, 10000, 5), 1f)
                        .fastToEat()
                        .setAlwaysEdible()
                        .build()));
    }
}

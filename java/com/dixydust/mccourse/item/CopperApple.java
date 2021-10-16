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

public class CopperApple extends Item {
    public CopperApple(){
        super(new Properties().group(MCCourseMod.COURSE_TAB)
                .food(new Food.Builder()
                        .hunger(6)
                        .saturation(1.5f)
                        .effect(() -> new EffectInstance(Effects.ABSORPTION, 300, 1), 1f)
                        .effect(() -> new EffectInstance(Effects.REGENERATION, 300, 1), 1f)
                        .setAlwaysEdible()
                        .build()));
    }
    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag){
        if(KeyboardHelper.isHoldingShift()){
            tooltip.add(new StringTextComponent("This makes things gay"));
        } else {
            tooltip.add(new StringTextComponent("Hold"+"\u00A7e"+" SHIFT "+"\u00A77"+"for more info"));
        }

        super.addInformation(stack, world, tooltip, flag);
    }
}

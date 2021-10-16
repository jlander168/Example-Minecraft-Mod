package com.dixydust.mccourse.item;

import com.dixydust.mccourse.MCCourseMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;


public enum EnderiteArmorMaterial implements IArmorMaterial {

    Enderite(50, new int[]{4, 7, 9,  4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            Ingredient.fromStacks(new ItemStack((ModItems.ENDERITE_INGOT.get()))),
            MCCourseMod.Mod_ID + ":enderite", 4.0F, 0.1f);

    private final int durability;
    private final int[] damageReductionArmoryArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final Ingredient repairMaterial;
    private final String name;
    private final float toughness;
    private final float knockbackResistance;

    EnderiteArmorMaterial(int durability, int[] damageReductionArmoryArray, int enchantability, SoundEvent soundEvent, Ingredient repairMaterial, String name, float toughness, float knockbackResistance) {
        this.durability = durability;
        this.damageReductionArmoryArray = damageReductionArmoryArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.repairMaterial = repairMaterial;
        this.name = name;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return durability;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return damageReductionArmoryArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return knockbackResistance;
    }
}

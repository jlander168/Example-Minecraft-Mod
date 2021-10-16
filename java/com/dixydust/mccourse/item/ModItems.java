package com.dixydust.mccourse.item;

import com.dixydust.mccourse.MCCourseMod;
import com.dixydust.mccourse.block.ModBlocks;
import com.dixydust.mccourse.block.ModFluids;
import com.dixydust.mccourse.util.Registration;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.rmi.registry.Registry;

public class ModItems {
    public static final RegistryObject<Item> COPPER_INGOT =
            Registration.ITEMS.register("copper_ingot",
            () -> new Item(new Item.Properties().group(MCCourseMod.COURSE_TAB)));

    public static final RegistryObject<Item> COPPER_WIRE =
            Registration.ITEMS.register("copper_wire",
                    () -> new Item(new Item.Properties().group(MCCourseMod.COURSE_TAB)));

    public static final RegistryObject<Item> COPPER_APPLE =
            Registration.ITEMS.register("copper_apple",
                    () -> new CopperApple());

    /*Tools*/

    public static final RegistryObject<Item> COPPER_SHOVEL =
            Registration.ITEMS.register("copper_shovel",
                    () -> new ShovelItem(ModItemTier.COPPER, 4f, -2.8f,
                            new Item.Properties()
                                .defaultMaxDamage(150)
                                .addToolType(ToolType.SHOVEL, 2)
                                .group(MCCourseMod.COURSE_TAB)));

    public static final RegistryObject<Item> COPPER_AXE =
            Registration.ITEMS.register("copper_axe",
                    () -> new AxeItem(ModItemTier.COPPER, 8, -3.2f,
                            new Item.Properties()
                                    .defaultMaxDamage(150)
                                    .addToolType(ToolType.AXE, 2)
                                    .group(MCCourseMod.COURSE_TAB)));

    public static final RegistryObject<Item> COPPER_PICKAXE =
            Registration.ITEMS.register("copper_pickaxe",
                    () -> new PickaxeItem(ModItemTier.COPPER, 4, -2.8f,
                            new Item.Properties()
                                    .defaultMaxDamage(150)
                                    .addToolType(ToolType.PICKAXE, 2)
                                    .group(MCCourseMod.COURSE_TAB)));

    public static final RegistryObject<Item> COPPER_SWORD =
            Registration.ITEMS.register("copper_sword",
                    () -> new SwordItem(ModItemTier.COPPER, 5, -2.8f,
                            new Item.Properties()
                                    .defaultMaxDamage(150)
                                    .group(MCCourseMod.COURSE_TAB)));

    public static final RegistryObject<Item> COPPER_HOE =
            Registration.ITEMS.register("copper_hoe",
                    () -> new HoeItem(ModItemTier.COPPER, 1, 0f,
                            new Item.Properties()
                                    .defaultMaxDamage(150)
                                    .addToolType(ToolType.HOE, 2)
                                    .group(MCCourseMod.COURSE_TAB)));

    /*ARMOR*/

    public static final RegistryObject<Item> COPPER_HELMET =
            Registration.ITEMS.register("copper_helmet",
                    () -> new ArmorItem(ModArmorMaterial.Copper, EquipmentSlotType.HEAD,
                            new Item.Properties().group(MCCourseMod.COURSE_TAB)));

    public static final RegistryObject<Item> COPPER_CHESTPLATE =
            Registration.ITEMS.register("copper_chestplate",
                    () -> new ArmorItem(ModArmorMaterial.Copper, EquipmentSlotType.CHEST,
                            new Item.Properties().group(MCCourseMod.COURSE_TAB)));

    public static final RegistryObject<Item> COPPER_LEGGINGS =
            Registration.ITEMS.register("copper_leggings",
                    () -> new ArmorItem(ModArmorMaterial.Copper, EquipmentSlotType.LEGS,
                            new Item.Properties().group(MCCourseMod.COURSE_TAB)));

    public static final RegistryObject<Item> COPPER_BOOTS =
            Registration.ITEMS.register("copper_boots",
                    () -> new ArmorItem(ModArmorMaterial.Copper, EquipmentSlotType.FEET,
                            new Item.Properties().group(MCCourseMod.COURSE_TAB)));


    public static RegistryObject<Item> ZUCCINI_SEEDS =
            Registration.ITEMS.register("zuccini_seeds",
                    () -> new BlockItem(ModBlocks.ZUCCINI_CROP.get(), new Item.Properties().group(MCCourseMod.COURSE_TAB)));


    public static RegistryObject<Item> CUM_BUCKET =
            Registration.ITEMS.register("cum_bucket",
                    () -> new BucketItem(ModFluids.CUM_FLUID::get,
                            new Item.Properties().group(MCCourseMod.COURSE_TAB).maxStackSize(1)));



    /*My Items */

    public static RegistryObject<Item> OBSIDIAN_ROD =
            Registration.ITEMS.register("obsidian_rod",
                    () -> new Item(new Item.Properties().group(MCCourseMod.ENDER_MOD)));

    public static final RegistryObject<Item> IRON_APPLE =
            Registration.ITEMS.register("iron_apple",
                    () -> new IronApple());

    public static final RegistryObject<Item> DIAMOND_APPLE =
            Registration.ITEMS.register("diamond_apple",
                    () -> new DiamondApple());

    public static final RegistryObject<Item> EMERALD_APPLE =
            Registration.ITEMS.register("emerald_apple",
                    () -> new EmeraldApple());

    public static final RegistryObject<Item> ENDERITE_INGOT =
            Registration.ITEMS.register("enderite_ingot",
                    () -> new Item(new Item.Properties().group(MCCourseMod.ENDER_MOD)));

    public static final RegistryObject<Item> ENDERITE_HELMET =
            Registration.ITEMS.register("enderite_helmet",
                    () -> new ArmorItem(EnderiteArmorMaterial.Enderite, EquipmentSlotType.HEAD,
                            new Item.Properties().group(MCCourseMod.ENDER_MOD)));

    public static final RegistryObject<Item> ENDERITE_CHESTPLATE =
            Registration.ITEMS.register("enderite_chestplate",
                    () -> new ArmorItem(EnderiteArmorMaterial.Enderite, EquipmentSlotType.CHEST,
                            new Item.Properties().group(MCCourseMod.ENDER_MOD)));

    public static final RegistryObject<Item> ENDERITE_LEGGINGS =
            Registration.ITEMS.register("enderite_leggings",
                    () -> new ArmorItem(EnderiteArmorMaterial.Enderite, EquipmentSlotType.LEGS,
                            new Item.Properties().group(MCCourseMod.ENDER_MOD)));

    public static final RegistryObject<Item> ENDERITE_BOOTS =
            Registration.ITEMS.register("enderite_boots",
                    () -> new ArmorItem(EnderiteArmorMaterial.Enderite, EquipmentSlotType.FEET,
                            new Item.Properties().group(MCCourseMod.ENDER_MOD)));

    public static void register(){}

    public enum ModArmorMaterial implements IArmorMaterial {
        Copper(50, new int[]{2, 5, 5,  2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
                Ingredient.fromStacks(new ItemStack((ModItems.COPPER_INGOT.get()))),
                MCCourseMod.Mod_ID + ":copper", 0, 0.1f);




        private final int durability;
        private final int[] damageReductionArmoryArray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final Ingredient repairMaterial;
        private final String name;
        private final float toughness;
        private final float knockbackResistance;

        ModArmorMaterial(int durability, int[] damageReductionArmoryArray, int enchantability, SoundEvent soundEvent,
                         Ingredient repairMaterial, String name, float toughness, float knockbackResistance) {
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

    public enum ModItemTier implements IItemTier {
        COPPER(2, 150, 2.5f, 0f, 15,
                Ingredient.fromStacks(new ItemStack(ModItems.COPPER_INGOT.get())));

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final Ingredient repairMaterial;

        ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Ingredient repairMaterial) {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = repairMaterial;
        }

        @Override
        public int getMaxUses() {
            return harvestLevel;
        }

        @Override
        public float getEfficiency() {
            return efficiency;
        }

        @Override
        public float getAttackDamage() {
            return attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return harvestLevel;
        }

        @Override
        public int getEnchantability() {
            return enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return repairMaterial;
        }
    }
}

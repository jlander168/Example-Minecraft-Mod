package com.dixydust.mccourse.block;

import com.dixydust.mccourse.MCCourseMod;
import com.dixydust.mccourse.item.ModItems;
import com.dixydust.mccourse.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;

public class ModFluids {
    public static final ResourceLocation CUM_STILL_RL = new ResourceLocation(MCCourseMod.Mod_ID,
            "block/cum_still");

    public static final ResourceLocation CUM_FLOWING_RL = new ResourceLocation(MCCourseMod.Mod_ID,
            "block/cum_flowing");

    public static final ResourceLocation CUM_OVERLAY_RL = new ResourceLocation(MCCourseMod.Mod_ID,
            "block/cum_overlay");

    public static final RegistryObject<FlowingFluid> CUM_FLUID =
            Registration.FLUIDS.register("cum_fluid",
                    () -> new ForgeFlowingFluid.Source(ModFluids.CUM_PROPERTIES));

    public static final RegistryObject<FlowingFluid> CUM_FLOWING =
            Registration.FLUIDS.register("cum_flowing",
                    () -> new ForgeFlowingFluid.Flowing(ModFluids.CUM_PROPERTIES));

    public static final ForgeFlowingFluid.Properties CUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> CUM_FLUID.get(), () -> CUM_FLOWING.get(), FluidAttributes.builder(CUM_STILL_RL, CUM_FLOWING_RL)
            .density(15).luminosity(15).rarity(Rarity.RARE).sound(SoundEvents.ITEM_BUCKET_EMPTY).overlay(CUM_OVERLAY_RL)
            .viscosity(5)).slopeFindDistance(3).levelDecreasePerBlock(3)
            .block(() -> ModFluids.CUM_BLOCK.get()).bucket(() -> ModItems.CUM_BUCKET.get());

    public static final RegistryObject<FlowingFluidBlock> CUM_BLOCK = Registration.BLOCKS.register("cum",
            () -> new FlowingFluidBlock(() -> ModFluids.CUM_FLUID.get(), AbstractBlock.Properties.create(Material.WATER)
                    .doesNotBlockMovement().hardnessAndResistance(100f).noDrops()));

    public static void register() {}
}

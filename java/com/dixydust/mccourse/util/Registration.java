package com.dixydust.mccourse.util;

import com.dixydust.mccourse.MCCourseMod;
import net.minecraft.block.Block;
import net.minecraft.block.ContainerBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class Registration {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MCCourseMod.Mod_ID);

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.Mod_ID);

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, MCCourseMod.Mod_ID);

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, MCCourseMod.Mod_ID);

    public static final DeferredRegister<ContainerType<?>> CONTAINERS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, MCCourseMod.Mod_ID);

    public static void init() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        FLUIDS.register(eventBus);
        TILE_ENTITY_TYPES.register(eventBus);
        CONTAINERS.register(eventBus);
    }
}

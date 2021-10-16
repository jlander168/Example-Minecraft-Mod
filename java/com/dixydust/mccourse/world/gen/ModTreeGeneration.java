package com.dixydust.mccourse.world.gen;

import com.dixydust.mccourse.MCCourseMod;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Set;

@Mod.EventBusSubscriber(modid = MCCourseMod.Mod_ID)
public class ModTreeGeneration {

    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent event){
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        
    }

}

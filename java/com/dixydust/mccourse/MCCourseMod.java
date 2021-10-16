package com.dixydust.mccourse;
import com.dixydust.mccourse.block.ModBlocks;
import com.dixydust.mccourse.block.ModFluids;
import com.dixydust.mccourse.container.ModContainers;
import com.dixydust.mccourse.events.ModEvents;
import com.dixydust.mccourse.item.ModItems;
import com.dixydust.mccourse.setup.ClientProxy;
import com.dixydust.mccourse.setup.IProxy;
import com.dixydust.mccourse.setup.ServerProxy;
import com.dixydust.mccourse.tileentity.ModTileEntities;
import com.dixydust.mccourse.util.Config;
import com.dixydust.mccourse.util.Registration;
import com.dixydust.mccourse.world.gen.ModOreGeneration;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MCCourseMod.Mod_ID)
public class MCCourseMod
{
    public static final String Mod_ID = "mccourse";

    public static final ItemGroup COURSE_TAB = new ItemGroup("courseTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.COPPER_WIRE.get());
        }
    };

    public static final ItemGroup ENDER_MOD = new ItemGroup("EnderMod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.OBSIDIAN_ROD.get());
        }
    };

    public static IProxy proxy;

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public MCCourseMod() {
        proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () ->ServerProxy::new);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        registerModAdditions();

        MinecraftForge.EVENT_BUS.register(this);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, ModOreGeneration::generateOres);
    }

    private void setup(final FMLCommonSetupEvent event) {
        registerConfigs();

        proxy.init();

        loadConfigs();
    }

    private void registerConfigs(){
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG);
    }

    private void loadConfigs(){
        Config.loadConfigFile(Config.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve("mccourse-client.toml").toString());
        Config.loadConfigFile(Config.SERVER_CONFIG, FMLPaths.CONFIGDIR.get().resolve("mccourse-client.toml").toString());
    }

    private void registerModAdditions(){
        //Inits the registration of our additions
        Registration.init();

        //registers items, blocks etc.
        ModItems.register();
        ModBlocks.register();
        ModFluids.register();
        ModTileEntities.register();
        ModContainers.register();

        //register mod events
        MinecraftForge.EVENT_BUS.register(new ModEvents());
    }


}

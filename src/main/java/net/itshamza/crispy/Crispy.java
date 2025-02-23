package net.itshamza.crispy;

import com.mojang.logging.LogUtils;

import net.itshamza.crispy.effects.ModEffects;
import net.itshamza.crispy.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Crispy.MOD_ID)
public class Crispy
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "crispy";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace

    public Crispy()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        ModItems.register(modEventBus);
        ModEffects.register(modEventBus);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.logDirtBlock)
            LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));

        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS){
            event.accept(ModItems.BURNT_COOKIE);
            event.accept(ModItems.COOKIE_DOUGH);
            event.accept(ModItems.COPPER_OREO);
            event.accept(ModItems.DIAMOND_OREO);
            event.accept(ModItems.FORTUNE_COOKIE);
            event.accept(ModItems.GOLD_OREO);
            event.accept(ModItems.GRAPES);
            event.accept(ModItems.IRON_OREO);
            event.accept(ModItems.OREO);
            event.accept(ModItems.PLAIN_COOKIE);
            event.accept(ModItems.RAISIN_COOKIE);
            event.accept(ModItems.RAISINS);
            event.accept(ModItems.RAW_CHOCOLATE_CHIP_COOKIE);
            event.accept(ModItems.RAW_RAISIN_COOKIE);
            event.accept(ModItems.RAW_CHOCOLATE_COOKIE);
            event.accept(ModItems.CHOCOLATE_COOKIE);
            event.accept(ModItems.RAW_WHITE_CHOCOLATE_COOKIE);
            event.accept(ModItems.RAW_WHITE_CHIP_CHOCOLATE_COOKIE);
            event.accept(ModItems.SPRINKLED_COOKIE);
            event.accept(ModItems.WHITE_CHOCOLATE_CHIP_COOKIE);
            event.accept(ModItems.WHITE_CHOCOLATE_COOKIE);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}

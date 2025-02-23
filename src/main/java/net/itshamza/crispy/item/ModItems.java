package net.itshamza.crispy.item;

import net.itshamza.crispy.Crispy;
import net.itshamza.crispy.item.ModFoods;
import net.itshamza.crispy.item.custom.FortuneCookieItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Crispy.MOD_ID);
    public static final RegistryObject<Item> COOKIE_DOUGH = ITEMS.register("cookie_dough",
            () -> new Item(new Item.Properties().food(ModFoods.COOKIE_DOUGH)));
    public static final RegistryObject<Item> BURNT_COOKIE = ITEMS.register("burnt_cookie",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLAIN_COOKIE = ITEMS.register("plain_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.PLAIN_COOKIE)));

    public static final RegistryObject<Item> RAW_CHOCOLATE_COOKIE = ITEMS.register("raw_chocolate_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.COOKIE_DOUGH)));
    public static final RegistryObject<Item> RAW_WHITE_CHOCOLATE_COOKIE = ITEMS.register("raw_white_chocolate_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.COOKIE_DOUGH)));
    public static final RegistryObject<Item> CHOCOLATE_COOKIE = ITEMS.register("chocolate_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_COOKIE)));
    public static final RegistryObject<Item> RAW_WHITE_CHIP_CHOCOLATE_COOKIE = ITEMS.register("raw_white_chocolate_chip_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.COOKIE_DOUGH)));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_COOKIE = ITEMS.register("white_chocolate_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_COOKIE)));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_CHIP_COOKIE = ITEMS.register("white_chocolate_chip_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_CHIP_COOKIE)));
    public static final RegistryObject<Item> RAW_CHOCOLATE_CHIP_COOKIE = ITEMS.register("raw_chocolate_chip_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.COOKIE_DOUGH)));
    public static final RegistryObject<Item> SPRINKLED_COOKIE = ITEMS.register("sprinkled_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.SPRINKLED_COOKIE)));
    public static final RegistryObject<Item> RAW_RAISIN_COOKIE = ITEMS.register("raw_raisin_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.COOKIE_DOUGH)));
    public static final RegistryObject<Item> RAISIN_COOKIE = ITEMS.register("raisin_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.RAISIN_COOKIE)));


    public static final RegistryObject<Item> OREO = ITEMS.register("oreo",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_COOKIE)));
    public static final RegistryObject<Item> COPPER_OREO = ITEMS.register("copper_oreo",
            () -> new Item(new Item.Properties().food(ModFoods.COPPER_OREO)));
    public static final RegistryObject<Item> IRON_OREO = ITEMS.register("iron_oreo",
            () -> new Item(new Item.Properties().food(ModFoods.IRON_OREO)));
    public static final RegistryObject<Item> GOLD_OREO = ITEMS.register("gold_oreo",
            () -> new Item(new Item.Properties().food(ModFoods.GOLD_OREO)));
    public static final RegistryObject<Item> DIAMOND_OREO = ITEMS.register("diamond_oreo",
            () -> new Item(new Item.Properties().food(ModFoods.DIAMOND_OREO)));


    public static final RegistryObject<Item> FORTUNE_COOKIE = ITEMS.register("fortune_cookie",
            () -> new FortuneCookieItem(new Item.Properties().food(ModFoods.FORTUNE_COOKIE)));

    public static final RegistryObject<Item> GRAPES = ITEMS.register("grapes",
            () -> new Item(new Item.Properties().food(ModFoods.GRAPES)));
    public static final RegistryObject<Item> RAISINS = ITEMS.register("raisins",
            () -> new Item(new Item.Properties().food(ModFoods.RAISINS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

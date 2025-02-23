package net.itshamza.crispy.item;

import net.itshamza.crispy.effects.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties COOKIE_DOUGH = new FoodProperties.Builder().nutrition(0).saturationMod(0f)
            .build();
    public static final FoodProperties PLAIN_COOKIE = new FoodProperties.Builder().nutrition(1).saturationMod(0.1f)
            .build();

    public static final FoodProperties CHOCOLATE_COOKIE = new FoodProperties.Builder().nutrition(3).saturationMod(0.3f)
            .effect(new MobEffectInstance(ModEffects.SUGAR_RUSH.get(), 400, 0), 1F).build();

    public static final FoodProperties WHITE_CHOCOLATE_COOKIE = new FoodProperties.Builder().nutrition(3).saturationMod(0.3f)
            .effect(new MobEffectInstance(ModEffects.SUGAR_RUSH.get(), 400, 0), 1F).build();

    public static final FoodProperties WHITE_CHOCOLATE_CHIP_COOKIE = new FoodProperties.Builder().nutrition(3).saturationMod(0.3f)
            .build();

    public static final FoodProperties SPRINKLED_COOKIE = new FoodProperties.Builder().nutrition(4).saturationMod(0.5f)
            .effect(new MobEffectInstance(ModEffects.SUGAR_RUSH.get(), 600, 1), 1F).build();

    public static final FoodProperties RAISIN_COOKIE = new FoodProperties.Builder().nutrition(3).saturationMod(0.3f)
            .build();

    public static final FoodProperties FORTUNE_COOKIE = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(new MobEffectInstance(MobEffects.LUCK, 1200, 1), 1F).build();

    public static final FoodProperties COPPER_OREO = new FoodProperties.Builder().nutrition(3).saturationMod(0.3f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 0), 1F).build();
    public static final FoodProperties GOLD_OREO = new FoodProperties.Builder().nutrition(3).saturationMod(0.3f)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 400, 0), 1F).build();
    public static final FoodProperties IRON_OREO = new FoodProperties.Builder().nutrition(3).saturationMod(0.3f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 400, 0), 1F).build();
    public static final FoodProperties DIAMOND_OREO = new FoodProperties.Builder().nutrition(3).saturationMod(0.3f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 0), 1F).build();

    public static final FoodProperties GRAPES = new FoodProperties.Builder().nutrition(3).saturationMod(0.3f)
            .build();
    public static final FoodProperties RAISINS = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .build();
}

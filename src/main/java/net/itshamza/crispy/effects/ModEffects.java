package net.itshamza.crispy.effects;



import net.itshamza.crispy.Crispy;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Crispy.MOD_ID);

    public static final RegistryObject<MobEffect> SUGAR_RUSH = MOB_EFFECTS.register("sugar_rush",
            () -> new SugarRushEffect());
    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}

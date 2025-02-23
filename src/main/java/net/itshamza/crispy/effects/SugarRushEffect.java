package net.itshamza.crispy.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

import java.util.UUID;

public class SugarRushEffect extends MobEffect {
    private static final UUID SPEED_UUID = UUID.fromString("e1d92b8e-8c1a-4e53-bbd8-83191e8f8e61");
    private static final UUID ATTACK_SPEED_UUID = UUID.fromString("d837e7c1-22a3-4c82-9989-5e1a7b06bbf3");

    public SugarRushEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xFFFF00);

        this.addAttributeModifier(Attributes.MOVEMENT_SPEED, SPEED_UUID.toString(), 0.1, AttributeModifier.Operation.MULTIPLY_TOTAL);

        this.addAttributeModifier(Attributes.ATTACK_SPEED, ATTACK_SPEED_UUID.toString(), 0.1, AttributeModifier.Operation.MULTIPLY_TOTAL);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {

    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return false;
    }

}

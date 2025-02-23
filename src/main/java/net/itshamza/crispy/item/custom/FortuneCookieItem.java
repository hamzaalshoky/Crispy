package net.itshamza.crispy.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;
import java.util.List;
import java.util.Random;

import java.util.List;

public class FortuneCookieItem extends Item {
    private static final Random RANDOM = new Random();


    private static final List<String> POSSIBLE_NAMES = List.of(
            "Good fortune awaits.",
            "Bad fortune awaits.",
            "I have a bad feeling about this.",
            "There's no laws against the Pokémon, batman.",
            "Well, if it isn't saucy Jack.",
            "I always come back.",
            "Well this is just fant4stic.",
            "The end is nigh.",
            "You swallowed the paper.",
            "Don't do it bro, trust me.",
            "Do it. Just do it. Stop thinking about it, just do it.",
            "No, they don't remember that cringe thing you did years ago.",
            "They're smack talking you behind your back right now.",
            "I CAST MANUAL BREATHING!",
            "I CAST TESTICULAR TORSION!",
            "Who cares about the message anyways, these cookies give you Luck II.",
            "I am the ruler of everything.",
            "I know what you did on August 23rd, 2016.",
            "Bring the Jenny mod back.",
            "[CENSORED]",
            "They love you.",
            "They love you not. Sike! Yes they do.",
            "Life is hard, but I know something that's harder.",
            "...Say that again?",
            "There's only a used napkin inside.",
            "There's only a used napkin inside. There's a number and a lipstick stain on it. Guess someone got rejected...",
            "ABCDEFGHIKLMNOPQRSTUVWXYZ",
            "I'm running out of ideas.",
            "It's only a crime if you get caught.",
            "White chocolate my goat.",
            "This cookie was made in a sweatshop, and you're a horrible person for consuming it.",
            "You're pregnant.",
            "You're pregnant. Again.",
            "That deserves five big booms.",
            "Dua Lipa my queen.",
            "Lunatic.",
            "Your son will never be Batman",
            "You will die in 3 minutes",
            "You will witness a crime in 3 minutes"
    );

    public FortuneCookieItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, net.minecraft.world.entity.LivingEntity entity) {
        if (!level.isClientSide && entity instanceof ServerPlayer player) {
            // Select a random name
            String randomName = POSSIBLE_NAMES.get(RANDOM.nextInt(POSSIBLE_NAMES.size()));

            // Create the renamed paper
            ItemStack namedPaper = new ItemStack(Items.PAPER);
            namedPaper.setHoverName(Component.literal(randomName));

            // Give the player the named paper
            if (!player.getInventory().add(namedPaper)) {
                player.drop(namedPaper, false); // Drop if inventory is full
            }
            entity.eat(level, stack);
            if(!player.isCreative()){
                stack.shrink(1);
            }

        }

        return stack.isEmpty() ? new ItemStack(Items.AIR) : stack;
    }
}

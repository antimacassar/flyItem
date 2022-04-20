package net.fabricmc.firstmod.items;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class NewItem extends Item {
    public NewItem(Settings settings){
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use (World world, PlayerEntity playerEntity, Hand hand){

        playerEntity.setVelocity(playerEntity.getVelocity().x, 1, playerEntity.getVelocity().z);
        playerEntity.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.7F/(RANDOM.nextFloat()*.4F + 8F));

        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        tooltip.add(new TranslatableText("Mysterious Wand makes you fly and makes a noise"));

        if (Screen.hasShiftDown()){
            tooltip.add(new TranslatableText("It's dark red in color!").formatted(Formatting.DARK_RED));
        }
        else{
            tooltip.add(new TranslatableText("Press Shift for more information").formatted(Formatting.DARK_GRAY));
        }
    }

}

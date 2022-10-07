package net.maselek.poopmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.maselek.poopmod.PoopMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class PoopGroup {
    public static final ItemGroup POOPMOD = FabricItemGroupBuilder.build(
            new Identifier(PoopMod.MODID, "poop"), () -> new ItemStack(ModItems.POOP));
}

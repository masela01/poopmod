package net.maselek.poopmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.maselek.poopmod.PoopMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item POOP = registerItem("poop",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PoopMod.MODID, name), item);
    }
    public static void registerModItems() {
        PoopMod.LOGGER.debug("Registering Poop");
    }
}

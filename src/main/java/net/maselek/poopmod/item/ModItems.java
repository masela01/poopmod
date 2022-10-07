package net.maselek.poopmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.maselek.poopmod.PoopMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item POOP = registerItem("poop",
            new Item(new FabricItemSettings().group(PoopGroup.POOPMOD)));
    public static final Item POOP_INGOT = registerItem("poop_ingot",
            new Item(new FabricItemSettings().group(PoopGroup.POOPMOD)));
    public static final Item REINFORCED_POOP_INGOT = registerItem("reinforced_poop_ingot",
            new Item(new FabricItemSettings().group(PoopGroup.POOPMOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PoopMod.MODID, name), item);
    }
    public static void registerModItems() {
        PoopMod.LOGGER.debug("Registering Poop");
    }
}

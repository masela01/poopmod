package net.maselek.poopmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.maselek.poopmod.PoopMod;
import net.maselek.poopmod.item.custom.PoopBallItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item POOP = registerItem("poop",
            new Item(new FabricItemSettings().group(PoopGroup.POOPMOD).food(PoopFoodComponent.POOP)));
    public static final Item POOP_INGOT = registerItem("poop_ingot",
            new Item(new FabricItemSettings().group(PoopGroup.POOPMOD)));
    public static final Item REINFORCED_POOP_INGOT = registerItem("reinforced_poop_ingot",
            new Item(new FabricItemSettings().group(PoopGroup.POOPMOD)));

    public static final Item POOP_BALL = registerItem("poop_ball",
            new PoopBallItem(new FabricItemSettings().group(PoopGroup.POOPMOD)));
    public static final Item REINFORCED_POOP_BALL = registerItem("reinforced_poop_ball",
            new PoopBallItem(new FabricItemSettings().group(PoopGroup.POOPMOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PoopMod.MODID, name), item);
    }
    public static void registerModItems() {
        PoopMod.LOGGER.debug("Registering Poop");
    }
}

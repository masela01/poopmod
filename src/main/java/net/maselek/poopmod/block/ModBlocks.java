package net.maselek.poopmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.maselek.poopmod.PoopMod;
import net.maselek.poopmod.item.PoopGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block POOP_BLOCK = registerBlock("poop_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(1f).slipperiness(0.8f)), PoopGroup.POOPMOD);
    public static final Block REINFORCED_POOP_BLOCK = registerBlock("reinforced_poop_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().luminance(15)), PoopGroup.POOPMOD);
    public static final Block POOP_ORE = registerBlock("poop_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool(),
                    UniformIntProvider.create(4, 8)), PoopGroup.POOPMOD);
    public static final Block DEEPSLATE_POOP_ORE = registerBlock("deepslate_poop_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(8f).requiresTool(),
                    UniformIntProvider.create(4, 8)), PoopGroup.POOPMOD);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(PoopMod.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(PoopMod.MODID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        PoopMod.LOGGER.debug("Registering Poop Blocks");
    }
}

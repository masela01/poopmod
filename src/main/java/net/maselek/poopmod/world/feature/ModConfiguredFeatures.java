package net.maselek.poopmod.world.feature;

import net.maselek.poopmod.PoopMod;
import net.maselek.poopmod.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_POOP_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.POOP_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_POOP_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> POOP_ORE =
            ConfiguredFeatures.register("poop_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_POOP_ORES, 10));



    public static void registerConfiguredFeatures() {
        PoopMod.LOGGER.debug("Registering ModConfiguredFeatures for " + PoopMod.MODID);
    }
}

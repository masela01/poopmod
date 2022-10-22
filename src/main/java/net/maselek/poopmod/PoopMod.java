package net.maselek.poopmod;

import net.fabricmc.api.ModInitializer;
import net.maselek.poopmod.block.ModBlocks;
import net.maselek.poopmod.item.ModItems;
import net.maselek.poopmod.world.feature.ModConfiguredFeatures;
import net.maselek.poopmod.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PoopMod implements ModInitializer {
	public static final String MODID = "poopmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModOreGeneration.generateOres();
	}
}

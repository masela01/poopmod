package net.maselek.poopmod;

import net.fabricmc.api.ModInitializer;
import net.maselek.poopmod.block.ModBlocks;
import net.maselek.poopmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PoopMod implements ModInitializer {
	public static final String MODID = "poopmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}

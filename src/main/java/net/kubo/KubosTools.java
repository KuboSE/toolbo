package net.kubo;

import net.fabricmc.api.ModInitializer;

import net.kubo.block.ModBlocks;
import net.kubo.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KubosTools implements ModInitializer {
	/**
	 * This is an interesting problem of Fabric.
	 * Now that it's all set up, basically, all things should work from here.
	 * This is basically the logging panel, really. It should say, "hi! This is me."
	 * Hopefully it does that...
	 */
    public static final String MOD_ID = "kubos-tools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	/*
	 * "No one'll stand in my way this time!"
	 * Added in Saccharum:
	 * (items) SIPP Cola, Newports,
	 * (blocks) Newports Block
	 * (functionality) None
	 *
	 * "Retooling destiny."
	 * Added:
	 * (items) Soulpowdered Iron, Soulpowdered Quartz Lamp, Jarred Crude Soul Crystal, Bowl of Soul Shards
	 * (blocks) Soulpowdered Iron Block
	 * (functionality) None
	 * TODO Waiting on textures for:
	 * 	SOULPOWDERED_QUARTZ_LAMP
	 * 	JARRED_CRUDE_SOUL_CRYSTAL
	 * 	BOWL_OF_SOUL_SHARDS
	 * 	BEWARE: SOULPOWDERED_QUARTZ_LAMP may be a block.
	 * 	Block relates: create:rose_quartz_lamp
	 *
	 */
	@Override
	public void onInitialize() {

		LOGGER.info("castleminer Z except I ate it");
		ModItems.registerModItems();
		LOGGER.info("Now featuring Feature Types!");
		ModBlocks.registerModBlocks();
	}
}
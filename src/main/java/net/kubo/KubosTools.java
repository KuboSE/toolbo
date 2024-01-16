package net.kubo;

import net.fabricmc.api.ModInitializer;

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

	@Override
	public void onInitialize() {

		LOGGER.info("shit your own ass rn dawg");
		ModItems.registerModItems();
	}
}
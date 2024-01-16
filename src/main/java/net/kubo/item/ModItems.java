package net.kubo.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kubo.KubosTools;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
public class ModItems {

    public static final Item SIPP_COLA = registerItem("sipp_cola", new Item(new FabricItemSettings().group(ModItemGroup.BOILEDINLIQUIDSHIT)));
    public static final Item NEWPORTS = registerItem("newports", new Item(new FabricItemSettings().group(ModItemGroup.BOILEDINLIQUIDSHIT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(KubosTools.MOD_ID, name), item);
    }
    public static void registerModItems() {
        KubosTools.LOGGER.info("HEY SHITASS WE'RE STICKING ITEMS FROM " + KubosTools.MOD_ID + " IN THIS BITCH");
        KubosTools.LOGGER.info("FUCK YOU BITCH");

    }
}

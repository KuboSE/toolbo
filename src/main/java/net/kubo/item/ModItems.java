package net.kubo.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kubo.KubosTools;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
public class ModItems {
    // Saccharum Items
    public static final Item SIPP_COLA = registerItem("sipp_cola", new Item(new FabricItemSettings().group(ModItemGroup.BOILEDINLIQUIDSHIT)));
    public static final Item NEWPORTS = registerItem("newports", new Item(new FabricItemSettings().group(ModItemGroup.BOILEDINLIQUIDSHIT)));
    // Cyanogen Items
    public static final Item SOULPOWDERED_IRON = registerItem("soulpowdered_iron", new Item(new FabricItemSettings().group(ModItemGroup.BOILEDINLIQUIDSHIT)));
    public static final Item JARRED_CRUDE_SOUL_CRYSTAL = registerItem("jarred_crude_soul_crystal", new Item(new FabricItemSettings().group(ModItemGroup.BOILEDINLIQUIDSHIT)));
    public static final Item BOWL_OF_SOUL_SHARDS = registerItem("bowl_of_soul_shards", new Item(new FabricItemSettings().group(ModItemGroup.BOILEDINLIQUIDSHIT)));

    /*
     TODO
      Newports Compressed is just nine Newports arranged in one.
      Make Soulpowdered Iron Block
    */

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(KubosTools.MOD_ID, name), item);
    }
    public static void registerModItems() {
        KubosTools.LOGGER.info("SACCHARUM REPORTS LIVE");
        KubosTools.LOGGER.info("CYANOGEN REPORTS LIVE");
    }
}

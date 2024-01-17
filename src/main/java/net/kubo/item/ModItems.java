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
    public static final Item SOULPOWDERED_QUARTZ_LAMP = registerItem("soulpowdered_quartz_lamp", new Item(new FabricItemSettings().group(ModItemGroup.BOILEDINLIQUIDSHIT)));
    public static final Item JARRED_CRUDE_SOUL_CRYSTAL = registerItem("jarred_crude_soul_crystal", new Item(new FabricItemSettings().group(ModItemGroup.BOILEDINLIQUIDSHIT)));
    public static final Item BOWL_OF_SOUL_SHARDS = registerItem("bowl_of_soul_shards", new Item(new FabricItemSettings().group(ModItemGroup.BOILEDINLIQUIDSHIT)));

    // TODO
    //  Recipes for Newports, Newports Compressed, SIPP Cola.
    //  Newports: 3 Paper, 1 Blaze Powder, 1 Gunpowder, 1 Wheat
    //  Newports Compressed is just nine Newports arranged in one.
    //  SIPP Cola: Blaze powder, sugar, glass bottle.

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(KubosTools.MOD_ID, name), item);
    }
    public static void registerModItems() {
        KubosTools.LOGGER.info("SACCHARUM REPORTS LIVE");
        KubosTools.LOGGER.info("CYANOGEN REPORTS LIVE");
    }
}

package net.kubo.block;

import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kubo.KubosTools;
import net.kubo.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block NEWPORTS_BUNDLE = registerBlock("newports_bundle", new Block(FabricBlockSettings.of(Material.CARPET).strength(.0005f).requiresTool()), ModItemGroup.BOILEDINLIQUIDSHIT);
    public static final Block SOULPOWDERED_IRON_BLOCK = registerBlock("soulpowdered_iron_block", new Block(FabricBlockSettings.of(Material.METAL).strength(5f).requiresTool()), ModItemGroup.BOILEDINLIQUIDSHIT);
    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(KubosTools.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(KubosTools.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        KubosTools.LOGGER.debug("SACCHARUM REPORTS " + NEWPORTS_BUNDLE.getName() + " IS LIVE");
        KubosTools.LOGGER.debug("CYANOGEN REPORTS " + SOULPOWDERED_IRON_BLOCK.getName() + " IS LIVE");
    }
}

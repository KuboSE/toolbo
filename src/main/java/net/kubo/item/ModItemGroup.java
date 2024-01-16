package net.kubo.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.kubo.KubosTools;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BOILEDINLIQUIDSHIT = FabricItemGroupBuilder.build(new Identifier(KubosTools.MOD_ID, "boiledinliquidshit"), () -> new ItemStack(ModItems.SIPP_COLA));
}

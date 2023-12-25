
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.needores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.needores.NeedOresMod;

public class NeedOresModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NeedOresMod.MODID);
	public static final RegistryObject<Item> TRANSDIMENSIONAL_MINER_TIER1 = block(NeedOresModBlocks.TRANSDIMENSIONAL_MINER_TIER1);
	public static final RegistryObject<Item> TRANSDIMENSIONAL_MINER_TIER_2 = block(NeedOresModBlocks.TRANSDIMENSIONAL_MINER_TIER_2);
	public static final RegistryObject<Item> TRANSDIMENSIONAL_MINER_TIER_3 = block(NeedOresModBlocks.TRANSDIMENSIONAL_MINER_TIER_3);
	public static final RegistryObject<Item> TRANSDIMENSIONAL_MINER_TIER_4 = block(NeedOresModBlocks.TRANSDIMENSIONAL_MINER_TIER_4);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

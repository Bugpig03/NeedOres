
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.needores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.needores.block.TransdimensionalMinerTier4Block;
import net.mcreator.needores.block.TransdimensionalMinerTier3Block;
import net.mcreator.needores.block.TransdimensionalMinerTier2Block;
import net.mcreator.needores.block.TransdimensionalMinerBlock;
import net.mcreator.needores.NeedOresMod;

public class NeedOresModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NeedOresMod.MODID);
	public static final RegistryObject<Block> TRANSDIMENSIONAL_MINER_TIER1 = REGISTRY.register("transdimensional_miner_tier1", () -> new TransdimensionalMinerBlock());
	public static final RegistryObject<Block> TRANSDIMENSIONAL_MINER_TIER_2 = REGISTRY.register("transdimensional_miner_tier_2", () -> new TransdimensionalMinerTier2Block());
	public static final RegistryObject<Block> TRANSDIMENSIONAL_MINER_TIER_3 = REGISTRY.register("transdimensional_miner_tier_3", () -> new TransdimensionalMinerTier3Block());
	public static final RegistryObject<Block> TRANSDIMENSIONAL_MINER_TIER_4 = REGISTRY.register("transdimensional_miner_tier_4", () -> new TransdimensionalMinerTier4Block());
}

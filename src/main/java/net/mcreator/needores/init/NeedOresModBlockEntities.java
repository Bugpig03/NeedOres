
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.needores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.needores.block.entity.TransdimensionalMinerTier4BlockEntity;
import net.mcreator.needores.block.entity.TransdimensionalMinerTier3BlockEntity;
import net.mcreator.needores.block.entity.TransdimensionalMinerTier2BlockEntity;
import net.mcreator.needores.block.entity.TransdimensionalMinerBlockEntity;
import net.mcreator.needores.NeedOresMod;

public class NeedOresModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, NeedOresMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TRANSDIMENSIONAL_MINER_TIER1 = register("transdimensional_miner_tier1", NeedOresModBlocks.TRANSDIMENSIONAL_MINER_TIER1, TransdimensionalMinerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TRANSDIMENSIONAL_MINER_TIER_2 = register("transdimensional_miner_tier_2", NeedOresModBlocks.TRANSDIMENSIONAL_MINER_TIER_2, TransdimensionalMinerTier2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TRANSDIMENSIONAL_MINER_TIER_3 = register("transdimensional_miner_tier_3", NeedOresModBlocks.TRANSDIMENSIONAL_MINER_TIER_3, TransdimensionalMinerTier3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TRANSDIMENSIONAL_MINER_TIER_4 = register("transdimensional_miner_tier_4", NeedOresModBlocks.TRANSDIMENSIONAL_MINER_TIER_4, TransdimensionalMinerTier4BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

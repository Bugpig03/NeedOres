
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.needores.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.needores.NeedOresMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NeedOresModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NeedOresMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(NeedOresModBlocks.TRANSDIMENSIONAL_MINER_TIER1.get().asItem());
			tabData.accept(NeedOresModBlocks.TRANSDIMENSIONAL_MINER_TIER_2.get().asItem());
			tabData.accept(NeedOresModBlocks.TRANSDIMENSIONAL_MINER_TIER_3.get().asItem());
			tabData.accept(NeedOresModBlocks.TRANSDIMENSIONAL_MINER_TIER_4.get().asItem());
		}
	}
}

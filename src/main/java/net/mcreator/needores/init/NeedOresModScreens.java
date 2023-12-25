
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.needores.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.needores.client.gui.TransdiemensionalMinerGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NeedOresModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(NeedOresModMenus.TRANSDIMENSIONAL_MINER_TIER1_GUI.get(), TransdiemensionalMinerGUIScreen::new);
		});
	}
}


/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.needores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.needores.world.inventory.TransdiemensionalMinerGUIMenu;
import net.mcreator.needores.NeedOresMod;

public class NeedOresModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, NeedOresMod.MODID);
	public static final RegistryObject<MenuType<TransdiemensionalMinerGUIMenu>> TRANSDIMENSIONAL_MINER_TIER1_GUI = REGISTRY.register("transdimensional_miner_tier1_gui", () -> IForgeMenuType.create(TransdiemensionalMinerGUIMenu::new));
}

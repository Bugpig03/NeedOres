package net.mcreator.needores.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.needores.world.inventory.TransdiemensionalMinerGUIMenu;
import net.mcreator.needores.procedures.ReturnTaskProgressBlockProcedure;
import net.mcreator.needores.procedures.ReturnNameOfBlockProcedure;
import net.mcreator.needores.procedures.ReturnEnergyBlockAndCapacityProcedure;
import net.mcreator.needores.procedures.ReturnConsumptionBlockProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TransdiemensionalMinerGUIScreen extends AbstractContainerScreen<TransdiemensionalMinerGUIMenu> {
	private final static HashMap<String, Object> guistate = TransdiemensionalMinerGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public TransdiemensionalMinerGUIScreen(TransdiemensionalMinerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 185;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("need_ores:textures/screens/transdimensional_miner_tier1_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 155 && mouseX < leftPos + 179 && mouseY > topPos + 52 && mouseY < topPos + 76)
			guiGraphics.renderTooltip(font, Component.literal(ReturnEnergyBlockAndCapacityProcedure.execute(world, x, y, z)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("need_ores:textures/screens/battery.png"), this.leftPos + 164, this.topPos + 61, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				ReturnNameOfBlockProcedure.execute(world, x, y, z), 11, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.need_ores.transdimensional_miner_tier1_gui.label_consumption"), 92, 25, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnConsumptionBlockProcedure.execute(world, x, y, z), 92, 34, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.need_ores.transdimensional_miner_tier1_gui.label_generate"), 92, 52, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnTaskProgressBlockProcedure.execute(world, x, y, z), 92, 61, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}

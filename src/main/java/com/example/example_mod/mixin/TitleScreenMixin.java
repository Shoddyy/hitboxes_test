package com.example.example_mod.mixin;

import net.minecraft.client.gui.screen.menu.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.example.example_mod.ExampleMod;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {

	@Inject(method = "init", at = @At("TAIL"))
	private void exampleMod$onInit(CallbackInfo ci) {
		ExampleMod.LOGGER.info("This line is printed by an example mod mixin!");
	}
}

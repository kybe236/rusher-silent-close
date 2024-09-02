package org.kybe;

import net.minecraft.network.protocol.game.ClientboundContainerClosePacket;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket;
import org.rusherhack.client.api.events.network.EventPacket;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;

/**
 * Silent close plugin
 *
 * @author kybe236
 */
public class SilentClose extends ToggleableModule {
	

	public SilentClose() {
		super("Silent close", "Silent close", ModuleCategory.MOVEMENT);
	}

	@Subscribe
	public void onPacket(EventPacket.Receive e) {
		if (e.getPacket() instanceof ClientboundContainerClosePacket) {
			e.setCancelled(true);
		}
	}
}

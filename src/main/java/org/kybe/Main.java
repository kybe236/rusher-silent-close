package org.kybe;

import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.plugin.Plugin;

/**
 * Silent close plugin
 *
 * @author kybe236
 */
public class Main extends Plugin {
	
	@Override
	public void onLoad() {
		final SilentClose silentclose = new SilentClose();
		RusherHackAPI.getModuleManager().registerFeature(silentclose);
	}

	@Override
	public void onUnload() {
	}

}
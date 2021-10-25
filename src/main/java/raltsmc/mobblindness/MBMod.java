package raltsmc.mobblindness;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import raltsmc.mobblindness.config.MBConfig;

public class MBMod implements ModInitializer {

	public static final String MODID = "mobblindness";
	public static final MBConfig CONFIG;

	@Override
	public void onInitialize() {
	}

	static {
		CONFIG = AutoConfig.register(MBConfig.class, JanksonConfigSerializer::new).getConfig();
	}
}

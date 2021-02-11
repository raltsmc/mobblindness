package raltsmc.mobblindness;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.JanksonConfigSerializer;
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

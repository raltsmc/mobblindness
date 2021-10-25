package raltsmc.mobblindness.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "mobblindness")
public class MBConfig implements ConfigData {
    @ConfigEntry.BoundedDiscrete(min = 1, max = 99)
    public int rangePercentPerLevel = 15;

    @Override
    public void validatePostLoad() throws ValidationException {
        if (this.rangePercentPerLevel > 99) {
            this.rangePercentPerLevel = 99;
        } else if (this.rangePercentPerLevel < 1) {
            this.rangePercentPerLevel = 1;
        }
    }
}

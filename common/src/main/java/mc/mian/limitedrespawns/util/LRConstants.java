package mc.mian.limitedrespawns.util;

import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LRConstants {
    public static final Logger LOGGER = LogManager.getLogger(LRConstants.MOD_ID);

    public static final String MOD_ID = "limitedrespawns";
    public static final String MOD_DISPLAY_NAME = "Limited Respawns";

    public static final ResourceLocation RESPAWNS = LRUtil.modLoc("respawns");
    public static final ResourceLocation TIME_OF_DEATH = LRUtil.modLoc("time_of_death");
}

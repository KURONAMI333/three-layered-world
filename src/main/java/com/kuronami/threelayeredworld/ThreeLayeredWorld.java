package com.kuronami.threelayeredworld;

import com.kuronami.isekaiapi.api.Isekai;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(ThreeLayeredWorld.MODID)
public final class ThreeLayeredWorld {
    public static final String MODID = "three_layered_world";
    public static final String VERSION = "0.1.0";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ThreeLayeredWorld(IEventBus modBus) {
        LOGGER.info("Three Layered World v{} loading", VERSION);
        LOGGER.info("Three Layered World: Isekai API facade ready (query={}, remap={})",
                Isekai.query().getClass().getSimpleName(),
                Isekai.remap().getClass().getSimpleName());
    }
}

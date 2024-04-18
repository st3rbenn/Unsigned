package com.sterben.unsigned;

import com.sterben.unsigned.core.init.BlockInit;
import com.sterben.unsigned.core.init.CreativeModeTabInit;
import com.sterben.unsigned.core.init.ItemInit;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(Unsigned.MODID)
public class Unsigned
{
    public static final String MODID = "unsigned";
    public static Logger logger = LoggerFactory.getLogger(Unsigned.class);

    public Unsigned(IEventBus bus) {
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeModeTabInit.CREATIVE_MODE_TABS.register(bus);
//
//        bus.addListener(FMLClientSetupEvent.class, (fmlClientSetupEvent -> {
//            fmlClientSetupEvent.enqueueWork(() -> {
//                ModList.get().getModContainerById(MODID).ifPresent(modContainer -> {
//                    logger.info("Loaded {}, using version {}", modContainer.getModInfo().getDisplayName(), modContainer.getModInfo().getVersion());
//                });
//            });
//        }));
    }

}

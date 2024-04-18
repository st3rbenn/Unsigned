package com.sterben.unsigned.core.init;

import com.sterben.unsigned.Unsigned;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeModeTabInit {
//    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Unsigned.MODID);
//
//    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> UNSIGNED_TAB = CREATIVE_MODE_TABS.register("Unsigned", () -> CreativeModeTab.builder()
//        .title(Component.translatable("itemGroup.unsigned"))
//        .displayItems((itemParams, output) -> {
//            ItemInit.ITEMS.getEntries()
//                .stream()
//                .map(DeferredHolder::get)
//                .forEach(output::accept);
//
//
//            BlockInit.BLOCKS.getEntries()
//                .stream()
//                .map(DeferredHolder::get)
//                .forEach(output::accept);
//        })
//        .icon(() -> new ItemStack(Blocks.OAK_SIGN))
//        .build());

    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Unsigned.MODID);

    // tab title
    public static String TUTORIAL_MOD_TAB_TITLE = "creativetab.unsigned";

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TUTORIAL_MOD_TAB = CREATIVE_MODE_TABS.register("tutorial_mod_tab", () -> {
        CreativeModeTab.Builder builder = CreativeModeTab.builder();

        builder.displayItems((itemDisplayParameters, output) -> {
            ItemInit.ITEMS.getEntries()
                .stream()
                .map(DeferredHolder::get)
                .forEach(output::accept);

            BlockInit.BLOCKS.getEntries()
                .stream()
                .map(DeferredHolder::get)
                .forEach(output::accept);
        });

        builder.icon(() -> new ItemStack(Blocks.OAK_SIGN));
        builder.title(Component.translatable(TUTORIAL_MOD_TAB_TITLE));

        return builder.build();
    });
}

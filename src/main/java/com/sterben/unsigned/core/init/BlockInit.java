package com.sterben.unsigned.core.init;

import com.sterben.unsigned.Unsigned;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Unsigned.MODID);

    public static final DeferredBlock<Block> OAK_UNSIGNED = registerBlock(
        "oak_unsigned",
        () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN))
    );

    public static DeferredBlock<Block> registerBlock(
        String name, Supplier<Block> block) {
        DeferredBlock<Block> blockReg = BLOCKS.register(name, block);
        ItemInit.ITEMS.register(name, () -> new BlockItem(blockReg.get(), new Item.Properties()));
        return blockReg;
    }
}

package org.taco.fearforge.Block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.taco.fearforge.FearsomeForge;
import org.taco.fearforge.Items.Ores;

import java.util.function.Supplier;

import static org.taco.fearforge.FearsomeForge.ITEMS;

public class OreBlocks {


    public static final DeferredRegister.Blocks BLOCKS =
        DeferredRegister.createBlocks(FearsomeForge.MODID);


public static final DeferredBlock<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new Block(BlockBehaviour.Properties.of()
        .strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

public static final DeferredItem<BlockItem> RUBY_ORE_ITEM = ITEMS.registerSimpleBlockItem(
        "ruby_ore", RUBY_ORE);

public static final DeferredBlock<Block> RUBY_ZOISITE = BLOCKS.register("ruby_zoisite",
        () -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

public static final DeferredItem<BlockItem> RUBBY_ZOISITE_ITEM = ITEMS.registerSimpleBlockItem(
        "ruby_zoisite", RUBY_ZOISITE);

public static final DeferredBlock<Block> TOPAZ_ORE = BLOCKS.register("topaz_ore",
        () -> new Block(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

public static final DeferredItem<BlockItem> TOPAZ_ORE_ITEM = ITEMS.registerSimpleBlockItem(
        "topaz_ore", TOPAZ_ORE);

public static final DeferredBlock<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore",
        () -> new Block(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.STONE)));

public static final DeferredItem<BlockItem> SAPPHIRE_ORE_ITEM = ITEMS.registerSimpleBlockItem(
        "sapphire_ore", SAPPHIRE_ORE);


    public  static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);

    }
}

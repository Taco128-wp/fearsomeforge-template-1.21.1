package org.taco.fearforge.Block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.taco.fearforge.FearsomeForge;

import static org.taco.fearforge.FearsomeForge.ITEMS;

public class OreBlocks {


    public static final DeferredRegister.Blocks BLOCKS =
        DeferredRegister.createBlocks(FearsomeForge.MODID);

//Ruby
public static final DeferredBlock<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new Block(BlockBehaviour.Properties.of()
        .strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

public static final DeferredItem<BlockItem> RUBY_ORE_ITEM = ITEMS.registerSimpleBlockItem(
        "ruby_ore", RUBY_ORE);


//Ruby Zoisite
public static final DeferredBlock<Block> RUBY_ZOISITE = BLOCKS.register("ruby_zoisite",
        () -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

public static final DeferredItem<BlockItem> RUBBY_ZOISITE_ITEM = ITEMS.registerSimpleBlockItem(
        "ruby_zoisite", RUBY_ZOISITE);


//Topaz
public static final DeferredBlock<Block> TOPAZ_ORE = BLOCKS.register("topaz_ore",
        () -> new Block(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

public static final DeferredItem<BlockItem> TOPAZ_ORE_ITEM = ITEMS.registerSimpleBlockItem(
        "topaz_ore", TOPAZ_ORE);


//Sapphire
public static final DeferredBlock<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore",
        () -> new Block(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.STONE)));

public static final DeferredItem<BlockItem> SAPPHIRE_ORE_ITEM = ITEMS.registerSimpleBlockItem(
        "sapphire_ore", SAPPHIRE_ORE);


//Turquoise
public static final DeferredBlock<Block> TURQUOISE_ORE = BLOCKS.register("turquoise_ore",
        () -> new Block(BlockBehaviour.Properties.of().strength(1f).sound(SoundType.STONE)));

public static final DeferredItem<BlockItem> TURQUOISE_ORE_ITEM = ITEMS.registerSimpleBlockItem(
        "turquoise_ore", TURQUOISE_ORE);

//rainbow pyrite

public static final DeferredBlock<Block> RAINBOW_PYRITE = BLOCKS.register("rainbow_pyrite",
        () -> new Block(BlockBehaviour.Properties.of().strength(1f).sound(SoundType.BONE_BLOCK)));

public static final DeferredItem RAINBOW_PYRITE_ITEM = ITEMS.registerSimpleBlockItem(
        "rainbow_pyrite", RAINBOW_PYRITE);

    public  static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);

    }
}

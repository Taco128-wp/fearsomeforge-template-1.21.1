package org.taco.fearforge.Items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.taco.fearforge.Block.OreBlocks;
import org.taco.fearforge.FearsomeForge;

import java.util.function.Supplier;

public class creativemodetab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FearsomeForge.MODID);

    public static final Supplier<CreativeModeTab> ORES_TAB = CREATIVE_MODE_TAB.register("ores_tab",
            () -> CreativeModeTab.builder().icon( () -> new ItemStack(ingots.MAGMATITE.get())).
            title(Component.translatable("creativetab.fearsomeforge.ores")).
            displayItems((itemDisplayParameters, output) -> {
                output.accept(ingots.MAGMATITE);
                output.accept(ingots.RUBY);
                output.accept(OreBlocks.RUBY_ORE);
                output.accept(Ores.RAW_RUBY);
                output.accept(Ores.RAW_RUBY_ZOISITE);
                output.accept(OreBlocks.RUBY_ZOISITE);
                output.accept(OreBlocks.TOPAZ_ORE);
                output.accept(Ores.RAW_TOPAZ);
                output.accept(Ores.RAW_SAPPHIRE);
                output.accept(Ores.SAPPHIRE);
                output.accept(Ores.SYNTHETIC_CORUNDUM);
                output.accept(OreBlocks.SAPPHIRE_ORE);

            })



            .build());


    public  static final  Supplier<CreativeModeTab> PARTS_TAB = CREATIVE_MODE_TAB.register("parts_tab",
            () -> CreativeModeTab.builder().icon( () -> new ItemStack(Ores.MOLTEN_RUBY.get()))
                    .title(Component.translatable("creativetab.fearsomeforge.parts"))
                    .displayItems((itemDisplayParameters, output) -> {
                      output.accept(Ores.CRUCIBLE_SMITHING_TOOL);
                      output.accept(Parts.PICKAXE_HEAD_TEMPLATE);
                      output.accept(Parts.AXE_HEAD_TEMPLATE);
                      output.accept(Parts.HOE_BLADE_TEMPLATE);
                      output.accept(Parts.SHOVEL_HEAD_TEMPLATE);
                      output.accept(Parts.SWORD_BLADE_TEMPLATE);

                    })


                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }


}

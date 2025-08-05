package org.taco.fearforge.Items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.taco.fearforge.FearsomeForge;

public class Parts {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(FearsomeForge.MODID);

    public static final DeferredItem<Item> PICKAXE_HEAD_TEMPLATE =
            ITEMS.register("pickaxe_head_template",
                () -> new Partupgradetemplate()
    );

    public static final DeferredItem<Item> AXE_HEAD_TEMPLATE =
            ITEMS.register("axe_head_template",
                    () -> new Partupgradetemplate()
            );

    public static final DeferredItem<Item>  SHOVEL_HEAD_TEMPLATE =
            ITEMS.register("shovel_head_template",
                    () -> new Partupgradetemplate()
            );

    public static final DeferredItem<Item> HOE_BLADE_TEMPLATE =
            ITEMS.register("hoe_blade_template",
                    () -> new Partupgradetemplate()
            );

    public static final DeferredItem<Item> SWORD_BLADE_TEMPLATE =
            ITEMS.register("sword_blade_template",
                    () -> new Partupgradetemplate()
            );


    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

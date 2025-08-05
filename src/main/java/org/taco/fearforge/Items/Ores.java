package org.taco.fearforge.Items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.taco.fearforge.FearsomeForge;

public class Ores {


    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(FearsomeForge.MODID);
    public static final DeferredItem<Item> RAW_RUBY =
            ITEMS.register("raw_ruby", () -> new Item(new Item.Properties()));
    public static final  DeferredItem<Item> RAW_RUBY_ZOISITE =
            ITEMS.register("raw_ruby_zoisite", () -> new Item(new Item.Properties()) );
    public static final DeferredItem<Item> RAW_TOPAZ =
            ITEMS.register("raw_topaz", () -> new Item(new Item.Properties()));

            // these still need to be given placeholder textures,
            // models, added to creative tab,givent en_lang translations,
            // and have ore blocks made(inc the steps for those too)

    public static final DeferredItem<Item> RAW_SAPPHIRE = //done
            ITEMS.register("raw_sapphire", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SAPPHIRE = //done
            ITEMS.register("sapphire", () -> new Item(new Item.Properties()));
    public static final  DeferredItem<Item> MOLTEN_RUBY = //done
            ITEMS.register("molten_ruby", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOLTEN_SAPPHIRE = //done
           ITEMS.register("molten_sapphire", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SYNTHETIC_CORUNDUM = //done
            ITEMS.register("synthetic_corundum", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRUCIBLE_SMITHING_TOOL = //done
           ITEMS.register("crucible_smithing_tool", ForgeToolUpgrade::new);



    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

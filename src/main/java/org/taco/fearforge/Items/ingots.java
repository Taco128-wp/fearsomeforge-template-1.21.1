package org.taco.fearforge.Items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.taco.fearforge.FearsomeForge;

public class ingots {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(FearsomeForge.MODID);

        //Magmatite ingot logic
    public static final DeferredItem<Item> MAGMATITE = ITEMS.register("magmatite",
            () -> new Item(new Item.Properties()));

        //Ruby gem logic
    public static final DeferredItem<Item> RUBY = ITEMS.register("ruby", () ->
         new Item(new Item.Properties()));


    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

package org.taco.fearforge.Items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ForgeToolUpgrade extends Item {
    public ForgeToolUpgrade() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
    }
}

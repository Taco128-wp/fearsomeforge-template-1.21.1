package org.taco.fearforge.Items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class Partupgradetemplate  extends Item {

    public Partupgradetemplate() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
    }
}

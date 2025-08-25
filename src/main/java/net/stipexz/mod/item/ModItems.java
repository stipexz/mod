package net.stipexz.mod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.stipexz.mod.Mod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod.MODID);

    public static final DeferredItem<Item> ERENIUM = ITEMS.registerSimpleItem(
            "erenium",
            new Item.Properties() // The properties to use.
    );
    public static final DeferredItem<Item> RAW_ERENIUM = ITEMS.registerSimpleItem(
            "raw_erenium",
            new Item.Properties() // The properties to use.
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

package net.LarsManeck.organMod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ORGAN_TAB = new CreativeModeTab("organtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LEAD_INGOT.get());
        }
    };
}

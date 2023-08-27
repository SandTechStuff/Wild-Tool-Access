package net.trueHorse.wildToolAccess;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.Collection;

public interface PlayerInventoryAccess {
    
    <T> ArrayList<ItemStack> getAllMainStacksOfType(Class<T> type);

    ArrayList<ItemStack> getAllMainStacksWithTag(TagKey<Item> tag);

    ArrayList<ItemStack> getAllMainStacksOf(Collection<Item> items);
}

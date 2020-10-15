package com.Exali.repulsorMod.util;


import com.Exali.repulsorMod.RepulsorMod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister.create(ForgeRegistries.ITEMS, RepulsorMod.MOD_ID);


    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
}

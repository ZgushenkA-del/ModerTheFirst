package ru.mmgroup.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static ru.mmgroup.OctopusInPanamaWithPanamaMod.MOD_ID;

public class BastChestplate extends ArmorItem {
    public BastChestplate(Settings settings, ArmorMaterial material) {
        super(material, Type.CHESTPLATE, settings);
    }

    public static void Initialize(ArmorMaterial material) {
        BastChestplate bastChestplate = new BastChestplate(new FabricItemSettings(), material);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> content.add(bastChestplate));
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "bast_chestplate"), bastChestplate);
    }
}


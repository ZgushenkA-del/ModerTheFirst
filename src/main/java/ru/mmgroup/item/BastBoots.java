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

public class BastBoots extends ArmorItem {
    public BastBoots(Settings settings, ArmorMaterial material) {
        super(material, Type.BOOTS, settings);
    }

    public static void Initialize(ArmorMaterial material) {
        BastBoots bastBoots = new BastBoots(new FabricItemSettings(), material);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> content.add(bastBoots));
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "bast_boots"), bastBoots);
    }
}

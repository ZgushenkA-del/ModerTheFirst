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

public class BastHelmet extends ArmorItem {
    public BastHelmet(Settings settings, ArmorMaterial material) {
        super(material, Type.HELMET, settings);
    }

    public static void Initialize(ArmorMaterial material) {
        BastHelmet bastHelmet = new BastHelmet(new FabricItemSettings(), material);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> content.add(bastHelmet));
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "bast_helmet"), bastHelmet);
    }
}

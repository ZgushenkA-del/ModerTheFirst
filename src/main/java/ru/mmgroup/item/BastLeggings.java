package ru.mmgroup.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static ru.mmgroup.OctopusInPanamaWithPanamaMod.MOD_ID;

public class BastLeggings extends ArmorItem {

    public BastLeggings(Settings settings, ArmorMaterial material) {
        super(material, Type.LEGGINGS, settings);
    }

    public static void Initialize(ArmorMaterial armorMaterial){
        BastLeggings bastLeggings = new BastLeggings(new FabricItemSettings(), armorMaterial);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "bast_leggings"), bastLeggings);
    }
}

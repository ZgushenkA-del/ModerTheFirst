package ru.mmgroup.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static ru.mmgroup.OctopusInPanamaWithPanamaMod.MOD_ID;

public class PanamaItem extends ArmorItem {
    public PanamaItem(Settings settings, ArmorMaterial material) {
        super(material, Type.HELMET, settings);
    }

    public static void Initialize(ArmorMaterial material) {
        PanamaItem panama = new PanamaItem(new FabricItemSettings().maxCount(1), material);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> content.add(panama));
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "panama"), panama);
    }
}

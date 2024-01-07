package ru.mmgroup.armormaterial;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import ru.mmgroup.item.BastBoots;
import ru.mmgroup.item.BastChestplate;
import ru.mmgroup.item.BastHelmet;
import ru.mmgroup.item.BastLeggings;

public class WheatArmorMaterial implements ArmorMaterial {
    private static final int[] PROTECTION_VALUES = new int[] {1, 2, 3, 1};
    @Override
    public int getDurability(ArmorItem.Type type) {
        return 0;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return PROTECTION_VALUES[type.getEquipmentSlot().getArmorStandSlotId() - 1];
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.BLOCK_GRASS_BREAK;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.WHEAT);
    }

    @Override
    public String getName() {
        return "wheatarmor";
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }

    public static void Initialize() {
        WheatArmorMaterial wheatArmor = new WheatArmorMaterial();
        BastHelmet.Initialize(wheatArmor);
        BastBoots.Initialize(wheatArmor);
        BastLeggings.Initialize(wheatArmor);
        BastChestplate.Initialize(wheatArmor);
    }
}

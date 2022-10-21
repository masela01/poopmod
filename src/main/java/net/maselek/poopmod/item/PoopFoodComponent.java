package net.maselek.poopmod.item;

import net.minecraft.item.FoodComponent;

public class PoopFoodComponent {
    public static final FoodComponent POOP =
            new FoodComponent.Builder().hunger(1).saturationModifier(0.4f).build();
}

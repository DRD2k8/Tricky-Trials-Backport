package com.drd.trickytrials.datagen;

import com.drd.trickytrials.TrickyTrials;
import com.drd.trickytrials.init.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeGenerator extends RecipeProvider implements IConditionBuilder {
    public ModRecipeGenerator(PackOutput p_248933_) {
        super(p_248933_);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_COPPER.get())
                .pattern("#")
                .pattern("#")
                .define('#', Items.CUT_COPPER_SLAB)
                .unlockedBy(getHasName(Items.CUT_COPPER_SLAB), has(Items.CUT_COPPER_SLAB))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_CHISELED_COPPER.get())
                .pattern("#")
                .pattern("#")
                .define('#', Items.EXPOSED_CUT_COPPER_SLAB)
                .unlockedBy(getHasName(Items.EXPOSED_CUT_COPPER_SLAB), has(Items.EXPOSED_CUT_COPPER_SLAB))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_CHISELED_COPPER.get())
                .pattern("#")
                .pattern("#")
                .define('#', Items.WEATHERED_CUT_COPPER_SLAB)
                .unlockedBy(getHasName(Items.WEATHERED_CUT_COPPER_SLAB), has(Items.WEATHERED_CUT_COPPER_SLAB))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_CHISELED_COPPER.get())
                .pattern("#")
                .pattern("#")
                .define('#', Items.OXIDIZED_CUT_COPPER_SLAB)
                .unlockedBy(getHasName(Items.OXIDIZED_CUT_COPPER_SLAB), has(Items.OXIDIZED_CUT_COPPER_SLAB))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_CHISELED_COPPER.get())
                .pattern("#")
                .pattern("#")
                .define('#', Items.WAXED_CUT_COPPER_SLAB)
                .unlockedBy(getHasName(Items.WAXED_CUT_COPPER_SLAB), has(Items.WAXED_CUT_COPPER_SLAB))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_CHISELED_COPPER.get())
                .pattern("#")
                .pattern("#")
                .define('#', Items.WAXED_EXPOSED_CUT_COPPER_SLAB)
                .unlockedBy(getHasName(Items.WAXED_EXPOSED_CUT_COPPER_SLAB), has(Items.WAXED_EXPOSED_CUT_COPPER_SLAB))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_CHISELED_COPPER.get())
                .pattern("#")
                .pattern("#")
                .define('#', Items.WAXED_WEATHERED_CUT_COPPER_SLAB)
                .unlockedBy(getHasName(Items.WAXED_WEATHERED_CUT_COPPER_SLAB), has(Items.WAXED_WEATHERED_CUT_COPPER_SLAB))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER.get())
                .pattern("#")
                .pattern("#")
                .define('#', Items.WAXED_OXIDIZED_CUT_COPPER_SLAB)
                .unlockedBy(getHasName(Items.WAXED_OXIDIZED_CUT_COPPER_SLAB), has(Items.WAXED_OXIDIZED_CUT_COPPER_SLAB))
                .save(consumer);

        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.COPPER_BLOCK, ModBlocks.CHISELED_COPPER.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.CUT_COPPER, ModBlocks.CHISELED_COPPER.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.EXPOSED_COPPER, ModBlocks.EXPOSED_CHISELED_COPPER.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.EXPOSED_CUT_COPPER, ModBlocks.EXPOSED_CHISELED_COPPER.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.WEATHERED_COPPER, ModBlocks.WEATHERED_CHISELED_COPPER.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.WEATHERED_CUT_COPPER, ModBlocks.WEATHERED_CHISELED_COPPER.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.OXIDIZED_COPPER, ModBlocks.OXIDIZED_CHISELED_COPPER.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.OXIDIZED_CUT_COPPER, ModBlocks.OXIDIZED_CHISELED_COPPER.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.WAXED_COPPER_BLOCK, ModBlocks.WAXED_CHISELED_COPPER.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.WAXED_CUT_COPPER, ModBlocks.WAXED_CHISELED_COPPER.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.WAXED_EXPOSED_COPPER, ModBlocks.WAXED_EXPOSED_CHISELED_COPPER.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.WAXED_EXPOSED_CUT_COPPER, ModBlocks.WAXED_EXPOSED_CHISELED_COPPER.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.WAXED_WEATHERED_COPPER, ModBlocks.WAXED_WEATHERED_CHISELED_COPPER.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.WAXED_WEATHERED_CUT_COPPER, ModBlocks.WAXED_WEATHERED_CHISELED_COPPER.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.WAXED_OXIDIZED_COPPER, ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.WAXED_OXIDIZED_CUT_COPPER, ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER.get(), 1);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COPPER_GRATE.get(), 4)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .define('#', Items.COPPER_BLOCK)
                .unlockedBy(getHasName(Items.COPPER_BLOCK), has(Items.COPPER_BLOCK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_COPPER_GRATE.get(), 4)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .define('#', Items.EXPOSED_COPPER)
                .unlockedBy(getHasName(Items.EXPOSED_COPPER), has(Items.EXPOSED_COPPER))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_COPPER_GRATE.get(), 4)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .define('#', Items.WEATHERED_COPPER)
                .unlockedBy(getHasName(Items.WEATHERED_COPPER), has(Items.WEATHERED_COPPER))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_COPPER_GRATE.get(), 4)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .define('#', Items.OXIDIZED_COPPER)
                .unlockedBy(getHasName(Items.OXIDIZED_COPPER), has(Items.OXIDIZED_COPPER))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_COPPER_GRATE.get(), 4)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .define('#', Items.WAXED_COPPER_BLOCK)
                .unlockedBy(getHasName(Items.WAXED_COPPER_BLOCK), has(Items.WAXED_COPPER_BLOCK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_COPPER_GRATE.get(), 4)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .define('#', Items.WAXED_EXPOSED_COPPER)
                .unlockedBy(getHasName(Items.WAXED_EXPOSED_COPPER), has(Items.WAXED_EXPOSED_COPPER))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_COPPER_GRATE.get(), 4)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .define('#', Items.WAXED_WEATHERED_COPPER)
                .unlockedBy(getHasName(Items.WAXED_WEATHERED_COPPER), has(Items.WAXED_WEATHERED_COPPER))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_COPPER_GRATE.get(), 4)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .define('#', Items.WAXED_OXIDIZED_COPPER)
                .unlockedBy(getHasName(Items.WAXED_OXIDIZED_COPPER), has(Items.WAXED_OXIDIZED_COPPER))
                .save(consumer);

        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.COPPER_BLOCK, ModBlocks.COPPER_GRATE.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.EXPOSED_COPPER, ModBlocks.EXPOSED_COPPER_GRATE.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.WEATHERED_COPPER, ModBlocks.WEATHERED_COPPER_GRATE.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.OXIDIZED_COPPER, ModBlocks.OXIDIZED_COPPER_GRATE.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.WAXED_COPPER_BLOCK, ModBlocks.WAXED_COPPER_GRATE.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.WAXED_EXPOSED_COPPER, ModBlocks.WAXED_EXPOSED_COPPER_GRATE.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.WAXED_WEATHERED_COPPER, ModBlocks.WAXED_WEATHERED_COPPER_GRATE.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Items.WAXED_OXIDIZED_COPPER, ModBlocks.WAXED_OXIDIZED_COPPER_GRATE.get(), 1);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COPPER_DOOR.get(), 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COPPER_TRAPDOOR.get(), 2)
                .pattern("###")
                .pattern("###")
                .define('#', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COPPER_BULB.get(), 4)
                .pattern(" C ")
                .pattern("CBC")
                .pattern(" R ")
                .define('C', Items.COPPER_BLOCK)
                .define('B', Items.BLAZE_ROD)
                .define('R', Items.REDSTONE)
                .unlockedBy(getHasName(Items.COPPER_BLOCK), has(Items.COPPER_BLOCK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_COPPER_BULB.get(), 4)
                .pattern(" C ")
                .pattern("CBC")
                .pattern(" R ")
                .define('C', Items.EXPOSED_COPPER)
                .define('B', Items.BLAZE_ROD)
                .define('R', Items.REDSTONE)
                .unlockedBy(getHasName(Items.EXPOSED_COPPER), has(Items.EXPOSED_COPPER))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_COPPER_BULB.get(), 4)
                .pattern(" C ")
                .pattern("CBC")
                .pattern(" R ")
                .define('C', Items.WEATHERED_COPPER)
                .define('B', Items.BLAZE_ROD)
                .define('R', Items.REDSTONE)
                .unlockedBy(getHasName(Items.WEATHERED_COPPER), has(Items.WEATHERED_COPPER))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_COPPER_BULB.get(), 4)
                .pattern(" C ")
                .pattern("CBC")
                .pattern(" R ")
                .define('C', Items.OXIDIZED_COPPER)
                .define('B', Items.BLAZE_ROD)
                .define('R', Items.REDSTONE)
                .unlockedBy(getHasName(Items.OXIDIZED_COPPER), has(Items.OXIDIZED_COPPER))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_COPPER_BULB.get(), 4)
                .pattern(" C ")
                .pattern("CBC")
                .pattern(" R ")
                .define('C', Items.WAXED_COPPER_BLOCK)
                .define('B', Items.BLAZE_ROD)
                .define('R', Items.REDSTONE)
                .unlockedBy(getHasName(Items.WAXED_COPPER_BLOCK), has(Items.WAXED_COPPER_BLOCK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_COPPER_BULB.get(), 4)
                .pattern(" C ")
                .pattern("CBC")
                .pattern(" R ")
                .define('C', Items.WAXED_EXPOSED_COPPER)
                .define('B', Items.BLAZE_ROD)
                .define('R', Items.REDSTONE)
                .unlockedBy(getHasName(Items.WAXED_EXPOSED_COPPER), has(Items.WAXED_EXPOSED_COPPER))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_COPPER_BULB.get(), 4)
                .pattern(" C ")
                .pattern("CBC")
                .pattern(" R ")
                .define('C', Items.WAXED_WEATHERED_COPPER)
                .define('B', Items.BLAZE_ROD)
                .define('R', Items.REDSTONE)
                .unlockedBy(getHasName(Items.WAXED_WEATHERED_COPPER), has(Items.WAXED_WEATHERED_COPPER))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_COPPER_BULB.get(), 4)
                .pattern(" C ")
                .pattern("CBC")
                .pattern(" R ")
                .define('C', Items.WAXED_OXIDIZED_COPPER)
                .define('B', Items.BLAZE_ROD)
                .define('R', Items.REDSTONE)
                .unlockedBy(getHasName(Items.WAXED_OXIDIZED_COPPER), has(Items.WAXED_OXIDIZED_COPPER))
                .save(consumer);

        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_CHISELED_COPPER.get(), ModBlocks.CHISELED_COPPER.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_CHISELED_COPPER.get(), ModBlocks.EXPOSED_CHISELED_COPPER.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_CHISELED_COPPER.get(), ModBlocks.WEATHERED_CHISELED_COPPER.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER.get(), ModBlocks.OXIDIZED_CHISELED_COPPER.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_COPPER_GRATE.get(), ModBlocks.COPPER_GRATE.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_COPPER_GRATE.get(), ModBlocks.EXPOSED_COPPER_GRATE.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_COPPER_GRATE.get(), ModBlocks.WEATHERED_COPPER_GRATE.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_COPPER_GRATE.get(), ModBlocks.OXIDIZED_COPPER_GRATE.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_COPPER_DOOR.get(), ModBlocks.COPPER_DOOR.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_COPPER_DOOR.get(), ModBlocks.EXPOSED_COPPER_DOOR.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_COPPER_DOOR.get(), ModBlocks.WEATHERED_COPPER_DOOR.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_COPPER_DOOR.get(), ModBlocks.OXIDIZED_COPPER_DOOR.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_COPPER_TRAPDOOR.get(), ModBlocks.COPPER_TRAPDOOR.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR.get(), ModBlocks.EXPOSED_COPPER_TRAPDOOR.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR.get(), ModBlocks.WEATHERED_COPPER_TRAPDOOR.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR.get(), ModBlocks.OXIDIZED_COPPER_TRAPDOOR.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_COPPER_BULB.get(), ModBlocks.COPPER_BULB.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_COPPER_BULB.get(), ModBlocks.EXPOSED_COPPER_BULB.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_COPPER_BULB.get(), ModBlocks.WEATHERED_COPPER_BULB.get(), consumer);
        waxingFromHoneycomb(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_COPPER_BULB.get(), ModBlocks.OXIDIZED_COPPER_BULB.get(), consumer);
    }

    protected static void stonecutting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory category, ItemLike ingredient, ItemLike result, int count) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), category, result, count)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(pFinishedRecipeConsumer, TrickyTrials.MOD_ID + ":" + getItemName(result) + "_from_" + getItemName(ingredient) + "_stonecutting");
    }

    protected static void waxingFromHoneycomb(RecipeCategory category, ItemLike waxedItem, ItemLike unwaxedItem, Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(category, waxedItem)
                .requires(unwaxedItem)
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(unwaxedItem), has(unwaxedItem))
                .save(consumer, TrickyTrials.MOD_ID + ":" + getItemName(waxedItem) + "_from_honeycomb");
    }
}

package kiibun.panacea.recipes;

import kiibun.panacea.item.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Chloe on 1/11/2017.
 */
public class Mod_Recipes extends ModItems {

    public static void addRecipes() {
        GameRegistry.addRecipe(new ItemStack(ModItems.FlintSword),
                "A",
                "A",
                "B",
                'A', Items.FLINT, 'B', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(ModItems.FlintAxe),
                "AA",
                "BA",
                "B ",
                'A', Items.FLINT, 'B', Items.STICK
        );
    }
}

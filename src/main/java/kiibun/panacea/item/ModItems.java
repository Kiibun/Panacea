package kiibun.panacea.item;

import kiibun.panacea.Panacea;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Chloe on 1/11/2017.
 */
public class ModItems {

    public static Item FlintSword;
    public static Item FlintAxe;

    public static void preInit() {

        FlintSword = new Item_FlintSword(EnumHelper.addToolMaterial("Flint", 3, 200, 0, 0, 10), "Flint_Sword");
        FlintAxe =  new Item_FlintAxe(EnumHelper.addToolMaterial("Flint", 3, 200, 0, 0, 10), "Flint_Axe");

        registerItems();
    }

    public static void registerItems() {
        GameRegistry.register(FlintSword, new ResourceLocation(Panacea.MODID, "Flint_Sword"));
        GameRegistry.register(FlintAxe, new ResourceLocation(Panacea.MODID, "Flint_Axe"));

    }

    public static void registerRenders() {
        registerRender(FlintSword);
        registerRender(FlintAxe);
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Panacea.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}

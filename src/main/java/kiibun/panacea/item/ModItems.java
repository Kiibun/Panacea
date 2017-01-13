package kiibun.panacea.item;

import kiibun.panacea.Panacea;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Chloe on 1/11/2017.
 */
public class ModItems {

    public static Item FlintSword;
    public static Item FlintAxe;
    public static Item FlintPickaxe;
    public static Item FlintShovel;
    public static Item FlintHoe;

    public static void preInit() {

        FlintSword = new Item_FlintSword (Item.ToolMaterial.STONE, "Flint_Sword");
        FlintAxe =  new Item_FlintAxe (Item.ToolMaterial.STONE, "Flint_Axe");
        FlintPickaxe = new Item_FlintPickaxe(Item.ToolMaterial.STONE, "Flint_Pickaxe");
        FlintShovel = new Item_FlintShovel(Item.ToolMaterial.STONE, "Flint_Shovel");
        FlintHoe = new Item_FlintHoe(Item.ToolMaterial.STONE, "Flint_Hoe");


        registerItems();
    }

    public static void registerItems() {
        GameRegistry.register(FlintSword, new ResourceLocation(Panacea.MODID, "Flint_Sword"));
        GameRegistry.register(FlintAxe, new ResourceLocation(Panacea.MODID, "Flint_Axe"));
        GameRegistry.register(FlintPickaxe, new ResourceLocation(Panacea.MODID, "Flint_Pickaxe"));
        GameRegistry.register(FlintShovel, new ResourceLocation(Panacea.MODID, "Flint_Shovel"));
        GameRegistry.register(FlintHoe, new ResourceLocation(Panacea.MODID, "Flint_Hoe"));

    }

    public static void registerRenders() {
        registerRender(FlintSword);
        registerRender(FlintAxe);
        registerRender(FlintPickaxe);
        registerRender(FlintShovel);
        registerRender(FlintHoe);
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Panacea.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}

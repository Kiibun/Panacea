package kiibun.panacea;

import kiibun.panacea.item.ModItems;
import kiibun.panacea.proxy.CommonProxy;
import kiibun.panacea.recipes.Mod_Recipes;
import kiibun.panacea.tab.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Panacea.MODID, version = Panacea.VERSION, name = Panacea.NAME)
public class Panacea
{
    public static final String MODID = "panacea";
    public static final String VERSION = "beta";
    public static final String NAME = "Panacea";

    @SidedProxy(clientSide = "kiibun.panacea.proxy.ClientProxy", serverSide = "kiibun.panacea.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Panacea instance;
    public static CreativeTab tabTutorial;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        tabTutorial = new CreativeTab(CreativeTabs.getNextID(), "Creative_Tab");
        ModItems.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        Mod_Recipes.addRecipes();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

}

package kiibun.panacea.item;


import kiibun.panacea.Panacea;
import net.minecraft.item.ItemSword;

/**
 * Created by Chloe on 1/11/2017.
 */
public class Item_FlintSword extends ItemSword {

        public Item_FlintSword(ToolMaterial material, String name) {
            super(material);
            setUnlocalizedName(name);
            setCreativeTab(Panacea.tabTutorial);
            setMaxStackSize(1);
    }
}


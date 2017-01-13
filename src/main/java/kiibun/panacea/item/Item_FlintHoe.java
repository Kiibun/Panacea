package kiibun.panacea.item;

import kiibun.panacea.Panacea;
import net.minecraft.item.ItemHoe;

/**
 * Created by Chloe on 1/13/2017.
 */
public class Item_FlintHoe extends ItemHoe {

        public Item_FlintHoe(ToolMaterial material, String name) {
            super(material);
            setUnlocalizedName(name);
            setCreativeTab(Panacea.tabTutorial);
            setMaxStackSize(1);
    }
}

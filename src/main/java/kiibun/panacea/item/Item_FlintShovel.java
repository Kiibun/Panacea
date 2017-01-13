package kiibun.panacea.item;

import kiibun.panacea.Panacea;
import net.minecraft.item.ItemSpade;

/**
 * Created by Chloe on 1/13/2017.
 */
public class Item_FlintShovel extends ItemSpade {

        public Item_FlintShovel(ToolMaterial material, String name) {
            super(material);
            setUnlocalizedName(name);
            setCreativeTab(Panacea.tabTutorial);
            setMaxStackSize(1);
    }
}

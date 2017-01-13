package kiibun.panacea.item;

import kiibun.panacea.Panacea;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by Chloe on 1/13/2017.
 */
public class Item_FlintPickaxe extends ItemPickaxe {

        public Item_FlintPickaxe(ToolMaterial material, String name) {
            super(material);
            setUnlocalizedName(name);
            setCreativeTab(Panacea.tabTutorial);
            setMaxStackSize(1);
    }
}

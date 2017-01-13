package kiibun.panacea.item;

import kiibun.panacea.Panacea;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

/**
 * Created by Chloe on 1/12/2017.
 */
public class Item_FlintAxe extends ItemAxe {

    public Item_FlintAxe(ToolMaterial material, String name) {
        super(material);
        setUnlocalizedName(name);
        setCreativeTab(Panacea.tabTutorial);
        setMaxStackSize(1);

    }

}

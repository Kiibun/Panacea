package kiibun.panacea.tab;

import kiibun.panacea.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Chloe on 1/11/2017.
 */
public class CreativeTab extends CreativeTabs {

    public CreativeTab(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.FlintSword;

    }
}

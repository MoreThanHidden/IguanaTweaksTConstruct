package iguanaman.iguanatweakstconstruct.tweaks.handlers;

import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import slimeknights.tconstruct.library.TConstructRegistry;
import slimeknights.tconstruct.library.event.ToolBuildEvent;
import slimeknights.tconstruct.library.event.ToolCraftEvent;
import slimeknights.tconstruct.tools.TinkerTools;

public class StringBindingHandler {

    @SubscribeEvent
    public void onToolBuild(ToolBuildEvent event)
    {
        if(event.accessoryStack == null || event.accessoryStack.getItem() == null)
            return;

        if(event.accessoryStack.getItem() == Items.string)
            event.accessoryStack = new ItemStack(TinkerTools.binding, 1, 40); // string binding

    }

    @SubscribeEvent
    public void onToolCraft(ToolCraftEvent event)
    {
        // we don't allow any string tools.
        // This basically is to hide the string material from players, since there are no craftable string parts
        if(event.materials[0] == TConstructRegistry.getMaterial(40))
            event.setResult(Event.Result.DENY);
    }
}

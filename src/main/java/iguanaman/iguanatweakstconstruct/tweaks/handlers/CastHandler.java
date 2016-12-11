package iguanaman.iguanatweakstconstruct.tweaks.handlers;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import slimeknights.tconstruct.library.event.SmelteryCastedEvent;
import slimeknights.tconstruct.library.util.IPattern;

public class CastHandler {
    @SubscribeEvent
    public void onCasted(SmelteryCastedEvent.CastingTable event)
    {
        if(event.output.getItem() instanceof IPattern)
            event.consumeCast = true;
    }
}

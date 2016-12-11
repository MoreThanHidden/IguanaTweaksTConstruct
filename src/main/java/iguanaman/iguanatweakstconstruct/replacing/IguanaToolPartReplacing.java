package iguanaman.iguanatweakstconstruct.replacing;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import iguanaman.iguanatweakstconstruct.reference.Reference;
import slimeknights.mantle.pulsar.pulse.Handler;
import slimeknights.mantle.pulsar.pulse.Pulse;
import net.minecraftforge.common.MinecraftForge;
import slimeknights.tconstruct.library.crafting.ModifyBuilder;

/**
 * Allows the replacement of toolparts.
 * Basically it adds a modifier that turns each toolpart into a modifier.
 */

@Pulse(id = Reference.PULSE_REPLACING, description = "Replace parts of tools")
public class IguanaToolPartReplacing {

    @Handler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Handler
    public void init(FMLInitializationEvent event)
    {
        ModifyBuilder.registerModifier(new ModPartReplacement());
    }

    @Handler
    public void postInit(FMLPostInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new PartToolTipHandler());
    }
}

package iguanaman.iguanatweakstconstruct;

public class AntiChiselDupeHandler {
  /*@SubscribeEvent
  public void onItemCrafted(PlayerEvent.ItemCraftedEvent event)
  {
    //TODO wait... the chisel was removed from 1.10?
    if(event.crafting  == null || event.crafting.getItem() != TinkerTools.chisel)
      return;

    // the output was a chisel, we therefore either replaced something or fixed it or repaired it or whatever
    // we remove the chisel form the crafting grid otherwise it's duped
    for(int i = 0; i < event.craftMatrix.getSizeInventory(); i++) {
      ItemStack stack = event.craftMatrix.getStackInSlot(i);
      if(stack != null && stack.getItem() == TinkerTools.chisel)
        event.craftMatrix.setInventorySlotContents(i, null);
    }
  }
*/
}

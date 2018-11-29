package com.otis.betteroofing.Client;

import com.otis.betteroofing.Util.OtisLog;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGameOver;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

@Mod.EventBusSubscriber
public class OofHandler {

@SubscribeEvent
    public static void onPlayerDeath(GuiOpenEvent event) {
    if(event.getGui() instanceof GuiGameOver && Minecraft.getMinecraft().currentScreen == null && !Minecraft.getMinecraft().player.isDead) {
        final EntityPlayer entityPlayer = Minecraft.getMinecraft().player;

        Random random = new Random();
        OtisLog.Log("Someone Said The O-Word Time To Oof!",1);

        entityPlayer.playSound(SoundsHandler.OOF, 5, random.nextInt(1) + 1);
    }
  }

   @SubscribeEvent
    public static void onChatMessage(ServerChatEvent event) {
      if  (event.getMessage().equalsIgnoreCase("oof")) {
           final EntityPlayer entityPlayer = Minecraft.getMinecraft().player;
          Random random = new Random();
          OtisLog.Log("Someone Said The O-Word Time To Oof!",1);

          entityPlayer.playSound(SoundsHandler.OOF, 5, random.nextInt(1) + 1);
       }
       }
   }


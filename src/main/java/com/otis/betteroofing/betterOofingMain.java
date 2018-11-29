/**
 * Created by Otis_Goodman before I made this snazzy template so there is no date.
 * This is licensed under the GNU General Public License v3.0
 * https://github.com/Quack-Craft-Moding-Team/Quack-Craft/blob/Src/LICENSE
 * If you would like to see the src go to
 * https://github.com/Quack-Craft-Moding-Team/Quack-Craft/tree/Src
 * Now run along now and eat your quackers!
 */
package com.otis.betteroofing;

import com.otis.betteroofing.Client.OofHandler;
import com.otis.betteroofing.Client.SoundsHandler;
import com.otis.betteroofing.Util.ModInfo;
import com.otis.betteroofing.Util.OtisLog;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.MODID,name = ModInfo.NAME,version = ModInfo.VERSION,updateJSON = ModInfo.UPDATELINK,clientSideOnly = true,canBeDeactivated = true)

public class betterOofingMain {

@Mod.Instance
    betterOofingMain instance;
@Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event){
    OtisLog.IntiLog(event);
    MinecraftForge.EVENT_BUS.register(new OofHandler());

}


    @Mod.EventHandler
    public static void init(FMLInitializationEvent event){
        SoundsHandler.registerSounds();

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event){

    }


}

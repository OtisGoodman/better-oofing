/**
 * Created by Otis_Goodman on 11/1/2018.
 * This is licensed under the GNU General Public License v3.0
 * https://github.com/Quack-Craft-Moding-Team/Quack-Craft/blob/Src/LICENSE
 * If you would like to see the src go to
 * https://github.com/Quack-Craft-Moding-Team/Quack-Craft/tree/Src
 * Now run along now and eat your quackers!
 */
package com.otis.betteroofing.Client;

import com.otis.betteroofing.Util.ModInfo;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler {
public static SoundEvent OOF;
public static void registerSounds (){
    OOF = registerSound("oof");





}

private static SoundEvent registerSound(String soundName){

    ResourceLocation location = new ResourceLocation(ModInfo.MODID,""+soundName);
    SoundEvent event = new SoundEvent(location);
    event.setRegistryName(soundName);
    ForgeRegistries.SOUND_EVENTS.register(event);
    return event;
}

}
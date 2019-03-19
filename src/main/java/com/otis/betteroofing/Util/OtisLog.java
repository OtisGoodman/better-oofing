
package com.otis.betteroofing.Util;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;



public class OtisLog {
    /**Table O Log
     * 0 Info
     *
     * 1 Warn
     *
     * 2 Error
     *
     * 3 Fatal
     *
     * 4 Debug
     *
     *
     * @param message String
     * @param type int
     */
    public static void Log (String message, int type){
       if (type == 0){
           OTISLOG.info(message);
       }
       if (type == 1){
           OTISLOG.warn(message);
       }
       if (type == 2){
           OTISLOG.error(message);
       } if (type == 3){
           OTISLOG.fatal(message);
       }
       if (type == 4){
           OTISLOG.debug(message);
       }
    }
    public static Logger OTISLOG;
    public static void IntiLog (FMLPreInitializationEvent event){
        OTISLOG = event.getModLog();
        OTISLOG.info("Starting "+ ModInfo.MODID+" Log!");
    }

}

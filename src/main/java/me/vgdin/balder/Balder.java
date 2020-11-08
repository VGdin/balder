package me.vgdin.balder;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
    modid = Balder.MODID,
    name = Balder.NAME,
    version = Balder.VERSION
)
public final class Balder
{
    public static final String MODID = "balder";
    public static final String NAME = "Balder";
    public static final String VERSION = "0.1";


    @Mod.Instance
    private static Balder INSTANCE;

    private static Logger logger;


    @EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}

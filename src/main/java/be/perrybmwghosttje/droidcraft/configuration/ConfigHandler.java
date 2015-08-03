package be.perrybmwghosttje.droidcraft.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Kevin on 11/07/2015.
 */
public class ConfigHandler {
    private static Configuration conf;

    public static void init(File file)
    {
        conf = new Configuration(file);

        conf.save();
    }
}
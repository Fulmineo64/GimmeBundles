package dev.fulmineo.gimme_bundles;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GimmeBundles implements ModInitializer {

	public static Logger LOGGER = LogManager.getLogger();

    // Identifiers

    public static final String MOD_ID = "gimme_bundles";

    // Entities

    // Items

    @Override
    public void onInitialize() {}

	public static void info(String message){
        LOGGER.log(Level.INFO, message);
    }
}
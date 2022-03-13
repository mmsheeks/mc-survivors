package gg.clovercraft.survivors;

import gg.clovercraft.survivors.playerManager.EventManager;
import gg.clovercraft.survivors.playerManager.PlayerManager;
import gg.clovercraft.survivors.util.Data;
import net.fabricmc.api.DedicatedServerModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SurvivorServerMod implements DedicatedServerModInitializer {

    public static final String NAMESPACE = "ccsurvivors";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAMESPACE);

    @Override
    public void onInitializeServer() {
        LOGGER.info( "Loading CC Survivors Mod" );

        Data DB = new Data( LOGGER );
        PlayerManager players = new PlayerManager( LOGGER, DB );
        EventManager events = new EventManager( players );
        events.registerEvents();
    }
}

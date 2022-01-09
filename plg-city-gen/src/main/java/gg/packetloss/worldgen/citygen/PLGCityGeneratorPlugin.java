/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package gg.packetloss.worldgen.citygen;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class PLGCityGeneratorPlugin extends JavaPlugin {

    private Logger logger;

    public void onEnable() {

        logger = getServer().getLogger();
        logger.info("Enabled!");

    }

    public void onDisable() {

        logger.info("Disabled.");
    }

    public ChunkGenerator getDefaultWorldGenerator(String worldName, String uid) {
        return new PLGCityGenerator(this);
    }
}

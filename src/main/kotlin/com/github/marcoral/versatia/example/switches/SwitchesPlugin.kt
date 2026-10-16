package com.github.marcoral.versatia.example.switches

import com.github.marcoral.versatia.DisableVersatiaFeatures
import com.github.marcoral.versatia.Phase
import com.github.marcoral.versatia.lifecycle.AutoInvoke
import org.bukkit.event.HandlerList

/** Inherits the extraction switch from `QuietPlugin` and switches listener registration off itself. */
@DisableVersatiaFeatures(registerListeners = true)
class SwitchesPlugin : QuietPlugin() {
    @AutoInvoke(Phase.PLUGIN_START_ONLY)
    fun report() {
        logger.info("unused.yml extracted: ${dataFolder.resolve("unused.yml").exists()}")
        logger.info("listeners registered: ${HandlerList.getRegisteredListeners(this).size}")
    }
}

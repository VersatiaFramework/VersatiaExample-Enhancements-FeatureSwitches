package dev.versatia.example.switches

import dev.versatia.DisableVersatiaFeatures
import dev.versatia.Phase
import dev.versatia.lifecycle.AutoInvoke
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

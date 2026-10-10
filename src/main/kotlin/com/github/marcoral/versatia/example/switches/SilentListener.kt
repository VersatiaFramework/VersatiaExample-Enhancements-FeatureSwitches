package com.github.marcoral.versatia.example.switches

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

/** Would be registered automatically; the switch on `SwitchesPlugin` leaves it alone. */
class SilentListener : Listener {
    @EventHandler
    fun onJoin(event: PlayerJoinEvent) = event.player.sendMessage("You should never see this.")
}

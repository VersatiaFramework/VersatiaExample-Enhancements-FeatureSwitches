package dev.versatia.example.switches

import dev.versatia.DisableVersatiaFeatures
import dev.versatia.VersatiaPlugin

/** A base class switches a feature off for every plugin extending it. */
@DisableVersatiaFeatures(extractResources = true)
abstract class QuietPlugin : VersatiaPlugin()

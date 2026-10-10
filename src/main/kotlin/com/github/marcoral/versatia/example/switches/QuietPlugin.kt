package com.github.marcoral.versatia.example.switches

import com.github.marcoral.versatia.DisableVersatiaFeatures
import com.github.marcoral.versatia.VersatiaPlugin

/** A base class switches a feature off for every plugin extending it. */
@DisableVersatiaFeatures(extractResources = true)
abstract class QuietPlugin : VersatiaPlugin()

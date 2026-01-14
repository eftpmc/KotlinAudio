package com.doublesymmetry.kotlinaudio.models

interface PlayerOptions {
    var alwaysPauseOnInterruption: Boolean

    /**
     * Crossfade duration in milliseconds.
     * 0 = disabled
     */
    var crossfadeDurationMs: Long
}

internal data class DefaultPlayerOptions(
    override var alwaysPauseOnInterruption: Boolean = false,
    override var crossfadeDurationMs: Long = 0L,
) : PlayerOptions

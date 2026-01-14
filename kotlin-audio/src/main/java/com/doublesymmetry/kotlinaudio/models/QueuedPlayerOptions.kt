package com.doublesymmetry.kotlinaudio.models

import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.Player

interface QueuedPlayerOptions : PlayerOptions {
    override var alwaysPauseOnInterruption: Boolean
    var repeatMode: RepeatMode
        /**
     * Crossfade duration in milliseconds.
     * 0 = disabled
     */
    var crossfadeDurationMs: Long
}

class DefaultQueuedPlayerOptions(
    override var alwaysPauseOnInterruption: Boolean = false,
    override var crossfadeDurationMs: Long = 5_000L,
) : QueuedPlayerOptions

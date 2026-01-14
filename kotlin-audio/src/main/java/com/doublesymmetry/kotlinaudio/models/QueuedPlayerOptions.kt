package com.doublesymmetry.kotlinaudio.models

import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.Player

interface QueuedPlayerOptions : PlayerOptions {
    override var alwaysPauseOnInterruption: Boolean
    var crossfadeDurationMs: Long
}

class DefaultQueuedPlayerOptions(
    override var alwaysPauseOnInterruption: Boolean = false,
    override var crossfadeDurationMs: Long = 5_000L,
) : QueuedPlayerOptions

package com.doublesymmetry.kotlinaudio.models

import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.Player

interface QueuedPlayerOptions : PlayerOptions {
    override var alwaysPauseOnInterruption: Boolean
    var repeatMode: RepeatMode
    var crossfadeDurationMs: Long
}

class DefaultQueuedPlayerOptions(
    override var alwaysPauseOnInterruption: Boolean = false,
    override var repeatMode: RepeatMode = RepeatMode.OFF,
    override var crossfadeDurationMs: Long = 0L,
) : QueuedPlayerOptions

enum class RepeatMode {
    OFF, ONE, ALL;

    companion object {
        fun fromOrdinal(ordinal: Int): RepeatMode {
            return when (ordinal) {
                0 -> OFF
                1 -> ONE
                2 -> ALL
                else -> OFF
            }
        }
    }
}

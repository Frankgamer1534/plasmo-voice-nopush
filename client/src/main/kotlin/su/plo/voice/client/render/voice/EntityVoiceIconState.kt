package su.plo.voice.client.render.voice

import net.minecraft.resources.Identifier
import net.minecraft.world.phys.Vec3
import su.plo.slib.api.chat.component.McTextComponent

data class EntityVoiceIconState(
    val iconLocation: Identifier?,
    val iconOffset: Vec3,
    val percentText: McTextComponent?,
) {
    fun withOffset(x: Double, y: Double, z: Double): EntityVoiceIconState =
        copy(iconOffset = iconOffset.add(x, y, z))
}

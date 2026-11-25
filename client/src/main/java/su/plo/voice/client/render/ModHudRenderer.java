package su.plo.voice.client.render;

import net.minecraft.client.DeltaTracker;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;
import su.plo.lib.mod.client.ResourceLocationUtil;
import su.plo.lib.mod.client.render.gui.GuiRenderContext;
import su.plo.voice.client.event.HudRenderEvent;

public final class ModHudRenderer {
    public static final Identifier KEY = ResourceLocationUtil.mod("hud");

    public static void render(@NotNull GuiGraphicsExtractor graphics, @NotNull DeltaTracker delta) {
        HudRenderEvent.INSTANCE.getInvoker().onRender(new GuiRenderContext(graphics), delta.getRealtimeDeltaTicks());
    }
}

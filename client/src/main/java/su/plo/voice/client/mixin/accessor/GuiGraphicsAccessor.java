package su.plo.voice.client.mixin.accessor;

import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.resources.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

//#if MC>=1.21.6
import com.mojang.renderpearl.api.pipeline.RenderPipeline;
//#elseif MC>=1.21.2
//$$ import net.minecraft.client.renderer.RenderType;
//$$ import java.util.function.Function;
//#endif

@Mixin(GuiGraphicsExtractor.class)
public interface GuiGraphicsAccessor {
    //#if MC>=1.21.6
    @Invoker("innerBlit")
    void plasmovoice_innerBlit(RenderPipeline pipeline, Identifier textureLocation, int x0, int x1, int y0, int y1, float u0, float u1, float v0, float v1, int color);
    //#elseif MC>=1.21.2
    //$$ @Invoker("innerBlit")
    //$$ void plasmovoice_innerBlit(Function<ResourceLocation, RenderType> renderType, ResourceLocation textureLocation, int x0, int x1, int y0, int y1, float u0, float u1, float v0, float v1, int color);
    //#else
    //$$ @Invoker("innerBlit")
    //$$ void plasmovoice_innerBlit(ResourceLocation textureLocation, int x0, int x1, int y0, int y1, int z, float u0, float u1, float v0, float v1, float red, float green, float blue, float alpha);
    //#endif
}

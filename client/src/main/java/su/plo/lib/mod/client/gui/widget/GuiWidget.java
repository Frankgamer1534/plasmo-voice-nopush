package su.plo.lib.mod.client.gui.widget;

import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;
import su.plo.lib.mod.client.render.gui.GuiRenderContext;

public interface GuiWidget {

    Identifier MENU_LIST_BACKGROUND_LOCATION = Identifier.tryParse("textures/gui/menu_list_background.png");
    Identifier INWORLD_MENU_LIST_BACKGROUND_LOCATION = Identifier.tryParse("textures/gui/inworld_menu_list_background.png");

    Identifier FOOTER_SEPARATOR_LOCATION = Identifier.tryParse("textures/gui/footer_separator.png");
    Identifier INWORLD_FOOTER_SEPARATOR_LOCATION = Identifier.tryParse("textures/gui/inworld_footer_separator.png");

    int getWidth();

    int getHeight();

    void render(@NotNull GuiRenderContext context, int mouseX, int mouseY, float delta);
}

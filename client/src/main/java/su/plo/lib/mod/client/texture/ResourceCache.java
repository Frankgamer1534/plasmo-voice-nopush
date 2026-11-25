package su.plo.lib.mod.client.texture;

import com.google.common.collect.Maps;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public final class ResourceCache {

    private final Map<String, Identifier> locationByString = Maps.newConcurrentMap();

    public Identifier getLocation(@NotNull String resourceLocation) {
        return locationByString.computeIfAbsent(
                resourceLocation,
                Identifier::tryParse
        );
    }
}

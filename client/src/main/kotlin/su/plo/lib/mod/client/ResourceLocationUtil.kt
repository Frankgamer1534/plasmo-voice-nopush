package su.plo.lib.mod.client

import net.minecraft.IdentifierException
import net.minecraft.resources.Identifier

object ResourceLocationUtil {
    @JvmStatic
    fun tryBuild(
        namespace: String,
        location: String,
    ): Identifier? =
        Identifier.tryBuild(namespace, location)

    @JvmStatic
    @Throws(IdentifierException::class)
    fun build(
        namespace: String,
        location: String,
    ): Identifier =
    Identifier.fromNamespaceAndPath(namespace, location)

    @JvmStatic
    @Throws(IdentifierException::class)
    fun parse(location: String): Identifier =
        Identifier.parse(location)

    @JvmStatic
    fun mod(location: String): Identifier = tryBuild("plasmovoice", location)!!
}

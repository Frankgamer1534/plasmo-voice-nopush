# Plasmo Voice — Fabric 26.3

Standalone Gradle project that builds the **Plasmo Voice** client mod for **Minecraft 26.3 (Fabric)**.

The repository only contains the Fabric 26.3 client. Servers, proxies, other loaders and other
Minecraft versions are not included.

## Requirements

- JDK 25
- Internet access on the first build (Gradle, Loom, Minecraft and mod dependencies)

## Building

```bash
./gradlew build
```

The mod jar is written to `client/build/libs/plasmovoice-fabric-26.3-<version>.jar`.

## Testing in-game

```bash
./gradlew runClient
```

This launches a development Minecraft 26.3 client with the mod, Fabric Loader 0.20.1,
Fabric API 0.160.4+26.3 and Mod Menu 21.0.1.

## Dependencies

- Minecraft 26.3 (unobfuscated)
- Fabric Loader 0.20.1
- Fabric API 0.160.4+26.3
- Cloth Config 26.1.154
- Mod Menu 21.0.1
- slib 2.1.2 (`26.1-fabric`)
- fabric-permissions-api 0.7.0 (bundled)
- Opus / RNNoise native bindings (bundled)

## Layout

- `client` — Fabric client mod and the final shaded jar
- `common`, `protocol` — shared voice/protocol code
- `api/*` — public API modules
- `server/common`, `server-proxy-common` — server-side code used by the integrated server
- `macos/protocol` — microphone helper protocol used on macOS
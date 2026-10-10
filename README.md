    # VersatiaExample-Enhancements-FeatureSwitches

    Switching off what every plugin otherwise gets: `@DisableVersatiaFeatures` on a base class and on the main class, showing that the nearest declaration wins.

    Part of the [Versatia examples](https://github.com/VersatiaFramework/VersatiaExamples); documentation: [Enhancements on a base class](https://versatiaframework.github.io/VersatiaDocs/docs/internals/enhancements#enhancements-on-a-base-class).

    **Start with** [`SwitchesPlugin.kt`](src/main/kotlin/com/github/marcoral/versatia/example/switches/SwitchesPlugin.kt).

    ## What the log shows

    ```
    unused.yml extracted: false
listeners registered: 0
    ```


## Things to try

- Remove `@DisableVersatiaFeatures` from `SwitchesPlugin`: `SilentListener` is registered and the
  log says `listeners registered: 1`, while extraction stays off because `QuietPlugin` switched it off.
- Add `@ExtractResources` to `SwitchesPlugin`: the main class re-enables what its base class
  switched off, and `unused.yml` appears in the data folder.
- Write `@DisableVersatiaFeatures` without any switch: the build fails with `switches nothing off`.

## Building

Requires JDK 21 and VersatiaAPI in your local Maven repository (`./gradlew publishToMavenLocal`
in its checkout); running it requires a Paper 1.21.4 server with VersatiaCore installed.

```bash
./gradlew build
```

To have the JAR copied to your server after every build, copy `local.properties.example` to
`local.properties` and set `pluginsDir`. The generated descriptor is in
`build/generated/ksp/main/kotlin`; open it to see exactly what the runtime executes.

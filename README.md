# bb4-project-template
A minimal bb4 project that can be used as a template when creating new bb4 projects.

## How to use it

1. On GitHub, click **Use this template** to create a new `bb4-<your-project>` repository with its own history (recommended).
1. Clone the new repository locally. Keep the `gradle/` directory and the Gradle wrapper scripts (`gradlew`, `gradlew.bat`); they define which Gradle version builds the project.
1. Open the project in IntelliJ IDEA or another IDE with Gradle support. Current versions detect the Gradle wrapper automatically—you do not need to install Gradle separately or choose a local Gradle home during import.
1. Continuous integration is provided by GitHub Actions in [`.github/workflows/ci.yml`](.github/workflows/ci.yml). Customize that workflow when you are ready—for example, to publish SNAPSHOT artifacts or notify downstream repositories.

## Creating a new project from this template

After you create a repository from this template, replace the placeholder names and coordinates:

| What to change | Where |
|----------------|--------|
| Project / artifact name | `settings.gradle` → `rootProject.name`; `build.gradle` → `bb4.archivesBaseName` |
| Maven `group`, `version`, description | `build.gradle` |
| Application entry point | `build.gradle` → `bb4.mainClass` (sample: `com.barrybecker4.newpackage.run`) |
| Scala packages | Rename `scala-source/com/barrybecker4/newpackage` and `scala-test/com/barrybecker4/newpackage`, then update `package` declarations and imports |

The sample sources use package `com.barrybecker4.newpackage`. The runnable entry point is the `@main def run()` in `HelloWorld.scala`.

### Build, run, and test

```bash
./gradlew build    # compile and run tests
./gradlew run      # run the sample application
./gradlew test     # run tests only
```

### Further reading

- [Building bb4 Projects](https://github.com/bb4/bb4-common/wiki/Building-bb4-Projects)
- [Publishing bb4 Projects](https://github.com/bb4/bb4-common/wiki/Publishing-bb4-Projects)

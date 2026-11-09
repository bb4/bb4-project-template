# bb4-project-template
A minimal bb4 project that can be used as a template when creating new bb4 projects.

## How to use it

1. On GitHub, click **Use this template** to create a new `bb4-<your-project>` repository with its own history (recommended).
1. Clone the new repository locally. Keep the `gradle/` directory and the Gradle wrapper scripts (`gradlew`, `gradlew.bat`); they define which Gradle version builds the project.
1. Open the project in IntelliJ IDEA or another IDE with Gradle support. Current versions detect the Gradle wrapper automatically—you do not need to install Gradle separately or choose a local Gradle home during import.
1. Continuous integration is provided by GitHub Actions in [`.github/workflows/ci.yml`](.github/workflows/ci.yml). Customize that workflow when you are ready—for example, to publish SNAPSHOT artifacts or notify downstream repositories.

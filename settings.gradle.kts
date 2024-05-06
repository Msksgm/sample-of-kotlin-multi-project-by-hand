plugins {
  id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "sample-of-kotlin-multi-project-by-hand"

include("project-a")
project(":project-a").projectDir = file("multi-project/project-a")

include("project-b")
project(":project-b").projectDir = file("multi-project/project-b")

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    name := "scalaTemplate",
  )

// logging
libraryDependencies ++= Seq(
  "org.apache.logging.log4j" %% "log4j-api-scala" % "12.0",
  "org.apache.logging.log4j" % "log4j-core" % "2.20.0" % Runtime
)

// scalatest
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"
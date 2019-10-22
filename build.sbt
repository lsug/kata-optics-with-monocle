import Dependencies._

ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.github.lsug"
ThisBuild / organizationName := "London Scala User Group"


lazy val root = (project in file("."))
  .settings(
    name := "kata",
    libraryDependencies ++= Seq(
      monocleCore,
      monocleMacros,
      scalatest % Test,
      scalacheck % Test,
      scalacheckShapeless % Test
    ),
    testFrameworks += new TestFramework("minitest.runner.Framework"),
  )

import sbt._

object Dependencies {

  lazy val minitestVersion = "2.7.0"
  lazy val monocleVersion    = "2.0.0"

  lazy val minitest = "io.monix" %% "minitest" % minitestVersion
  lazy val scalatest = "org.scalatest" % "scalatest_2.13" % "3.0.8"
  lazy val scalacheck = "org.scalacheck" %% "scalacheck" % "1.14.1"
  lazy val monocleCore = "com.github.julien-truffaut" %% "monocle-core" % monocleVersion
  lazy val scalacheckShapeless = "com.github.alexarchambault" %% "scalacheck-shapeless_1.14" % "1.2.3"
  lazy val monocleMacros =   "com.github.julien-truffaut" %%  "monocle-macro" % monocleVersion
}

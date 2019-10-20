import sbt._

object Dependencies {

  lazy val minitestVersion = "2.7.0"
  lazy val monocleVersion    = "2.0.0"

  lazy val minitest = "io.monix" %% "minitest" % minitestVersion
  lazy val monocleCore = "com.github.julien-truffaut" %% "monocle-core" % monocleVersion
}

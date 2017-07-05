name := "fs2-db"

scalaVersion := "2.11.11"

val fs2Version = "0.10.0-M2"

libraryDependencies ++= Seq(
  "co.fs2" %% "fs2-core" % fs2Version,
  "co.fs2" %% "fs2-io" % fs2Version,
  "org.scalatest" %% "scalatest" % "3.0.3" % "test"
)

scalacOptions ++= Seq(
  "-feature",
  "-deprecation"
)

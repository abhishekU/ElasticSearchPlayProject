name := """myApp"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "org.elasticsearch" % "elasticsearch" % "0.19.3",
  "org.json" % "json" % "20090211",
  "com.google.code.gson" % "gson" % "2.3",
  "commons-lang" % "commons-lang" % "2.3",
  "org.apache.commons" % "commons-lang3" % "3.3.2",
  "com.googlecode.json-simple" % "json-simple" % "1.1"
)

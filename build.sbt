name := "xmlsoap-ersatz"

organization := "play2.tools.xml"

version := "0.2-SNAPSHOT"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.2.2" % "test",
  "junit" % "junit" % "4.8" % "test"  
)

publishTo <<=  version { (v: String) => 
  val base = "../../workspace_mandubian/mandubian-mvn"
  val suffix = if (v.trim.endsWith("SNAPSHOT")) "snapshots" else "releases"
  Some(Resolver.file(suffix, new File(base, suffix)))
}

publishMavenStyle := true

publishArtifact in Test := false


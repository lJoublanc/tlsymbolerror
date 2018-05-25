lazy val commonSettings = inThisBuild(Seq(
  scalaOrganization := "org.typelevel",
  scalaVersion := "2.12.4-bin-typelevel-4",
  scalacOptions += "-Yliteral-types"
  // scalaVersion := "2.13.0-M3",
)
)

lazy val a = (project in file("a")).settings(commonSettings : _*).settings(name := "a")

lazy val b = (project in file("b")).settings(commonSettings : _*).settings(name := "b").dependsOn(a)
    

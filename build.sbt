import AssemblyKeys._

name := "LogbackWAssembly"

version := "1.0"

scalaVersion := "2.9.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.1"

seq(assemblySettings: _*)

mainClass in assembly := Some("com.knoldus.logme.LogTester")

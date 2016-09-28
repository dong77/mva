name := """messaging-cluster"""

version := "0.1"

scalaVersion := "2.11.8"

lazy val akkaVersion = "2.4.0"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-tools" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
  "com.trueaccord.scalapb" %% "scalapb-runtime-grpc" % "0.5.42",
  "io.grpc" % "grpc-all" % "1.0.0",
  "io.netty" % "netty-tcnative-boringssl-static" % "1.1.33.Fork22",
  "org.scalatest" %% "scalatest" % "2.1.6" % "test")

import com.trueaccord.scalapb.{ScalaPbPlugin => PB}

PB.protobufSettings

scalaSource in PB.protobufConfig := sourceManaged.value

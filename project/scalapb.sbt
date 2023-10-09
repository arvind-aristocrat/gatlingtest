//import scalapb.compiler.Version.scalapbVersion

//addSbtPlugin("com.thesamet" % "sbt-protoc" % "1.0.6")
//
//libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.11.11"

val gatlingDependencies = Seq(
  "io.gatling.highcharts" % "gatling-charts-highcharts" % "4.5.0" % Test,
  "io.gatling" % "gatling-test-framework" % "4.5.0" % Test,
  "com.github.phisgr" % "gatling-grpc" % "0.11.1" % Test,
  "com.github.phisgr" % "gatling-ext" % "0.2.0" % Test
)
val grpcDependencies = Seq(
  "io.grpc" % "grpc-netty" % "1.36.0",
  "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % "0.99.33",
  "com.thesamet.scalapb" %% "scalapb-runtime" % "0.99.33" % "protobuf",
  "com.typesafe.akka" %% "akka-actor-typed" % "2.6.10",
  "com.typesafe.akka" %% "akka-protobuf-v3" % "2.6.10",
  "com.typesafe.akka" %% "akka-stream" % "2.6.10"
)
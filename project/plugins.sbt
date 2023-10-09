//addSbtPlugin("io.gatling" % "gatling-sbt" % "4.5.0")

// assembly
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.9")

// gatling
addSbtPlugin("io.gatling" % "gatling-sbt" % "4.5.0")

// akka
addSbtPlugin("com.lightbend.akka.grpc" % "sbt-akka-grpc" % "1.1.1")

// protoc
addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.33")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.10.11"
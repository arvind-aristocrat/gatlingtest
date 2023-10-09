package computerdatabase

import com.github.phisgr.gatling.grpc.Predef.{grpc, managedChannelBuilder}

object Constants {
  val HOST: String = "localhost"
  val PORT = 50051

  val grpcPsgConf = grpc(managedChannelBuilder(name = HOST, port = PORT).usePlaintext())
}
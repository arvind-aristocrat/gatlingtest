package computerdatabase
import com.aristocrat.b2bmc2.bingo.grpc.bingo.{BingoAdapterServiceGrpc, EmptyRequest}
import com.github.phisgr.gatling.grpc.Predef._
import computerdatabase.Constants.grpcPsgConf
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._

//class BasicItSimulation extends Simulation {

class GrpcSimulation1 extends Simulation {

  val scn = scenario("Make Hello Request and Get Response")
    .exec(grpc("Hello Request")
      .rpc(BingoAdapterServiceGrpc.METHOD_GET_STATUS)
      .payload(EmptyRequest())
      .extract(_.consumedEGMs.some)(_ saveAs "bingoCardSerialMax")

      //.extract(_.bingoCardSerialMin.some)(_ SaveAs "bingoCardSerialMin")
      //.check(statusCode is Status.Code.OK)
    )
//    .exec(grpc("Hello Request with parameter from session")
//      .rpc(GreeterServiceGrpc.METHOD_SAY_HELLO)
//      .payload(session => HelloRequest(session.attributes("message").asInstanceOf[String]))
//      .check(statusCode is Status.Code.OK)
//    )

  setUp(scn.inject(rampUsersPerSec(1) to (2) during (5 seconds)).protocols(grpcPsgConf))
}

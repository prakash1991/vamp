package io.magnetic.vamp_core.operation

import akka.actor.ActorSystem
import io.magnetic.vamp_common.akka.Bootstrap

object OperationBootstrap extends Bootstrap {

  def run(implicit actorSystem: ActorSystem) = {
    //ActorSupport.actorOf(ArtifactPersistenceActor)
  }
}

package io.magnetic.vamp_core.persistence.notification

import io.magnetic.vamp_common.akka.RequestError
import io.magnetic.vamp_common.notification.Notification
import io.magnetic.vamp_core.model.artifact.Artifact

case class UnsupportedPersistenceRequest(request: Any) extends Notification with RequestError

case class ArtifactNotFound(name: String, `type`: Class[_ <: Artifact]) extends Notification



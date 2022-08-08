plugins {
  `gradle-enterprise`
}

gradleEnterprise {
  buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
  }
}

include(":misk")
include(":misk-action-scopes")
include(":misk-actions")
include(":misk-admin")
include(":misk-aws")
include(":misk-aws-dynamodb")
include(":misk-aws-dynamodb-testing")
include(":misk-aws2-dynamodb")
include(":misk-aws2-dynamodb-testing")
include(":misk-bom")
include(":misk-core")
include(":misk-clustering")
include(":misk-cron")
include(":misk-crypto")
include(":misk-datadog")
include(":misk-eventrouter")
include(":misk-events")
include(":misk-events-core")
include(":misk-events-testing")
include(":misk-exceptions-dynamodb")
include(":misk-feature")
include(":misk-feature-testing")
include(":misk-gcp")
include(":misk-gcp-testing")
include(":misk-grpc-reflect")
include(":misk-grpc-tests")
include(":misk-hibernate")
include(":misk-hibernate-testing")
include(":misk-inject")
include(":misk-jdbc")
include(":misk-jdbc-testing")
include(":misk-jobqueue")
include(":misk-jobqueue-testing")
include(":misk-jooq")
include(":misk-launchdarkly")
include(":misk-launchdarkly-core")
include(":misk-metrics")
include(":misk-metrics-digester")
include(":misk-metrics-testing")
include(":misk-policy")
include(":misk-policy-testing")
include(":misk-prometheus")
include(":misk-proto")
include(":misk-redis")
include(":misk-service")
include(":misk-slack")
include(":misk-testing")
include(":misk-transactional-jobqueue")
include(":misk-warmup")
include(":misk-zookeeper")
include(":misk-zookeeper-testing")
include(":samples:exemplar")
include(":samples:exemplarchat")

// TODO migrate to wisp repo
include(":wisp-backoff")

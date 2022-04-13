#!groovy

package com.redhat

class ThreescaleEnvironment {
  String baseSystemName
  String targetSystemName
  String environmentName
  String stagingPublicBaseURL
  String productionPublicBaseURL
  String privateBaseUrl
  String oidcIssuerEndpoint
  String publicStagingWildcardDomain
  String publicProductionWildcardDomain
  String privateBasePath
  String publicBasePath
  String openshift
}


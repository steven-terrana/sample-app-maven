node {  
  checkout scm
  
  master_config = readYaml file: "master-config.yml"
  
  master_config.environments.each{ app_env ->
    this.getBinding().setVariable(app_env.getKey(), app_env.getValue())
  }
  
  println "ENVIRONMENT: ${dev.long_name}"
  println "NUMBER BANANAS: ${dev.number_bananas}"
  
}

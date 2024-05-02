def call(Map config){
    node{
      sh '''
      echo "${config.message}"
      git --version
      sudo apt-get install maven -y
      mvn --version
      '''
    }
}

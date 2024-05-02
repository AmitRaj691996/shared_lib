def call(Map config){
    node{
          
          echo "${config.message}"
          sh '''
          git --version
          sudo apt-get install maven -y
          mvn --version
          '''
    }
}

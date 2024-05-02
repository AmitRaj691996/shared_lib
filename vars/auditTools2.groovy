def call(Map config){
    node{
          echo "${config.message}"
          sh '''
          echo "Your Build number is: ${BUILD_NUMBER}"
          git --version
          sudo apt-get install maven -y
          mvn --version
          '''
    }
}

def call(){
  node{
    sh '''
    echo "Release version is : ${RELEASE}"
    git --version
    mvn --version
    java --version
  }
}

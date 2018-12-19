pipeline {
  agent any
  stages {
    stage('') {
      agent any
      steps {
        build(job: 'repo', quietPeriod: 1, propagate: true, wait: true)
      }
    }
  }
}
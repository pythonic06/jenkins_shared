def call(String url, String branch){
  echo "this is for cloning the code"
  git url: "%url%", branch: "%branch%"
  
}

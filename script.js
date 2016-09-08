function setup(){
  console.log("I am going to start the workshop.");
  createCanvas(500,500);

}
function draw(){
  var x = 5;
  var y = 5;

  background(0,125,255);
  var circle = ellipse(250,250,50);
  rect(250,490,100,10);
  if(keyIsPressed === true){
    circle.accelerationY(-10);
  }




}

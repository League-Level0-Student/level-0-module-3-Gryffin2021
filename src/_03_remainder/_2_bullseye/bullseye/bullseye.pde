
void setup() {
 
  // set the size of your sketch, idiot.
  size(500,500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses
  int beans = 450;
  for(int i = 0; i < 15; i++ ){
  
   
    if(beans % 2 == 0){
    fill(255,0,0);
    ellipse(250,250,beans,beans);
    beans -= 25;
    
    }else{
      
    fill(255,255,255);
    ellipse(250,250,beans,beans);
    beans -= 25;
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
}
}

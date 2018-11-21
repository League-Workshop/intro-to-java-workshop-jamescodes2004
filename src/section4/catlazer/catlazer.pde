int eyex=427;
int eyey=170;
int acceleration=5;
void setup(){
size(750, 420);
PImage catPic;
catPic=loadImage("cat.jpeg");
  catPic.resize(750, 420);
background (catPic);
}
void draw(){
  noStroke();
if(mousePressed)
    println ("Mouse's x-position: " + mouseX + "\n" + "Mouse's y-position: " +mouseY + "\n");

  ellipse(eyex, eyey, 20, 20);
  ellipse(eyex+75,eyey, 20, 20);
  fill (255, 0, 0);
}
void keyPressed(){
eyey+=acceleration;

eyex+=acceleration;

                           
}
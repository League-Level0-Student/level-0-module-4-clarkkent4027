boolean tailStuck=false;
int donkeytailx = mouseX;
int donkeytaily = mouseY;
int x=0;
int y=0;
PImage donkey;
PImage tail;
void setup() {
  donkey = loadImage("DoNkEy.jpg");      //change the file name if you need to
  tail = loadImage("TaIl.jpeg");      //change the file name if you need to
  size(1229, 1300);
}

void draw() {
  background (donkey);
  
  rect(0, 0, 252, 300);
  println("X; " + mouseX + " Y; " + mouseY);
  rect(1000, 630, 30, 30);


  if (dist(0, 0, mouseX, mouseY) > 30){
  background(#FF2B0A);
}else{
background(donkey);
}
if (mousePressed){
tailStuck = true;
  x = mouseX;
  y = mouseY;

}
  if (tailStuck){
image(tail, x+5, y+5);
  }else{
  image(tail, mouseX+5, mouseY+5);
}
if  ;
}

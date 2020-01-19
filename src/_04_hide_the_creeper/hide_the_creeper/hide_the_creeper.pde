int x=500;
int y=500;

PImage creeper;     //at the top of your program
PImage minecraft;
void setup() {
  size(1000, 1000);
  minecraft = loadImage("toddler-minecraft-creeper-costume-c.jpg");     //in setup method
  minecraft.resize(1000, 1000);          //in setup method
  background(minecraft);          //in setup method
  creeper=loadImage("creepy.png");     //in setup method
  creeper.resize(2, 2);
}

void draw() {
  background(minecraft); 
  image(creeper, x, y);     //in draw method
  ellipse(mouseX, mouseY, 1, 1);
if(isNear(mouseX, x)==true) && if(isNear(mouse{
}
}
boolean isNear(int x, int y) {
  if (abs(x - y) < 10) {
    return true;
  } else {
    return false;
  }
}

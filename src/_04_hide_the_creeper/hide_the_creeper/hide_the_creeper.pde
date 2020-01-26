import javax.swing.*;
int x =(int)random(900);
int y =(int)random(900);

PImage creeper;     //at the top of your program
PImage minecraft;
void setup() {
  size(1000, 1000);
  minecraft = loadImage("toddler-minecraft-creeper-costume-c.jpg");     //in setup method
  minecraft.resize(1000, 1000);          //in setup method
  background(minecraft);          //in setup method
  creeper=loadImage("creepy.png");     //in setup method
  creeper.resize( 2, 2);
}

void draw() {
  background(minecraft); 
  image(creeper, x, y);     //in draw method
  fill(#F50505);
  // ellipse(mouseX, mouseY, 10, 10);
  if (isNear(mouseX, x)==true&&isNear(mouseY, y)==true) {
    fill(#05F506);

   System.out.println("You found the Creeper!");
    int x =(int)random(900);
    int y =(int)random(900);
  }
  ellipse(mouseX, mouseY, 10, 10);
}
boolean isNear(int x, int y) {
  if (abs(x - y) < 10) {
    return true;
  } else {
    return false;
  }
}

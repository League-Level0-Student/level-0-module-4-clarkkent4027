import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;
PImage waldo;
void setup() {
  waldo = loadImage("wheres_waldo.jpg"); // Change this to match your file name.
  size(1000, 1000);
  waldo.resize(width,height);
  doh = minim.loadSample("homer-doh.wav"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("homer-woohoo.wav"); //drag and drop from project onto sketch } 
background(waldo);
}

void draw() {
      // Use this print statement to find out the coordinates of Waldo
      // println("X: " + mouseX + " Y: " + mouseY); 
println("X; " + mouseX + " Y; " + mouseY);
      // If the mouse is on Waldo, print “Waldo found!”
if (mousePressed){
if (mouseX == 961 && mouseY == 65){
  print("Waldo found!!!");
      // If Waldo is found, also use the method below to play “Woohoo”
      playWoohoo();}
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      if (mouseX != 961 && mouseY != 65){
     playDoh();
      }}
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

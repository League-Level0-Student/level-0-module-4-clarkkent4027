PImage face;
void setup() {
face = loadImage("ironcat.jpg");
    size(800,600);
    face.resize(width,height);
}

void draw() {
  background(face);
ellipse(300, 180, 100, 25);
}

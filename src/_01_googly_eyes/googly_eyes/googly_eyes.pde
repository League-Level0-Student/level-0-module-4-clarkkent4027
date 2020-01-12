PImage face;
void setup() {
face = loadImage("ironcat.jpg");
    size(800,600);
    face.resize(width,height);
}

void draw() {
  background(face);
println(mouseX+"   "+mouseY);
if(mouseX < 258){
mouseX = 258;
}if(mouseX > 336){
mouseX = 336;
}if(mouseY < 177){
mouseY = 177;
}if(mouseY > 185){
mouseY = 185;
}
fill(#07CBE3);
ellipse(300, 180, 100, 25);
fill(#070808);
ellipse(mouseX, mouseY, 25, 25);
fill(#07CBE3);
ellipse(500, 180, 100, 25);
fill(#070808);
ellipse(mouseX+210, mouseY, 25, 25);
}

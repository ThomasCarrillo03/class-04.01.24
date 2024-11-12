float posX = 0;
float posY = 0;

void setup() {
  size(800, 800);
  background(250);
}

void draw() {
  stalkingCircle(60, 7); // diameter 60 and speed 4
}

void stalkingCircle(float diameter, float speed) {
  circle(posX, posY, diameter);

  // Move the circle towards the mouse position
  if (posX < mouseX) posX += speed;
  if (posX > mouseX) posX -= speed;
  if (posY < mouseY) posY += speed;
  if (posY > mouseY) posY -= speed;
}

void mousePressed() {
  background(250);// Clear the background
  posX = random(0, 800);//put the circle in a random place in the acshe X
  posY = random(0, 800);//put the circle in a random place in the acshe Y
}

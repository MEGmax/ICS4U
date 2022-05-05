// Drawing Triangles

size(600, 200);
smooth();
background(#302F2F);
// Dark grey background colour
strokeWeight(5);

// Triangle 1:
triangle(150, 50, 200, 150, 100, 150);
// The format for a triangle is as follows:
// triangle(x, y, x, y, x, y);
// Three coordinates that specify the three
// points of a triangle

// Triangle 2:
noStroke();
// No outline
fill(#74AD92);
// Greenish colour fill
triangle(250, 50, 300, 150, 350, 50);
// upside down triangle

// Triangle 3:
stroke(#F07F47);
// Orage outline
noFill();
// No fill
triangle(450, 50, 500, 150, 400, 150);

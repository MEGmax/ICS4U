// Drawing Rectangles and Squares

size(600, 200);
smooth();
background(#FFFFCD);
strokeWeight(5);

// Rectangle 1
rectMode(CORNER);
// This line specicies to draw the square from
// its top left hand corner
rect(60, 60, 80, 80);
// Rectangle format is as follows:
// rect(x position, y position, width, height)


// Rectangle 2
rectMode(CENTER);
// This line specifies to draw the following square
// from its center
noStroke();
// Removes the outline
fill(#CC5C54);
// Creates a fill
rect(300, 100, 80, 80);


// Rectangle 3
rectMode(CORNERS);
// This line specifies the drawing of the following rectangle
// from its top left hand corner and it bottom right hand corner
stroke(#F69162);
// outline colour
noFill();
// Removes the fill
rect(460, 60, 540, 140);

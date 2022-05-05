// Drawing Quadrangles
// A quadrangle is a shape that is
// neither a rectangle or square

size(600, 200);
smooth();
background(#0C2550);
strokeWeight(5);
// outline thickness

// Diamond 1:
quad(150, 50, 200, 100, 150, 150, 100, 100);
// The format for a quadrangle is as follows:
// quad(x, y, x, y, x, y, x, y);
// The quad function accepts fours pairs of x and y
// coordinates (a pair for each point)

// Diamond 2:
noStroke();
// No outline
fill(#A3D0C1);
// Light blue fill
quad(300, 50, 350, 100, 300, 150, 250, 100);


// Diamond 3:
stroke(#FDF6DD);
// light gray outline
noFill();
// no fill
quad(450, 50, 500, 100, 450, 150, 400, 100);
 

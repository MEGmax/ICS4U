// Drawing Bezier Curves

size(600, 200);
smooth();
background(#9F9694);
noFill();

// Curve 1 Control Points
stroke(#F1E6D4);
strokeWeight(2);
line(100, 50, 250, 50);
line(100, 150, 250, 150);

// Curve 1
stroke(#791F33);
strokeWeight(3);
bezier(100, 50, 250, 50, 100, 150, 250, 150);
// Bezier curve format
// bezier(x1, y1, x2, y2, x3, y3, x4, y4);
// x1, y1 is the coordinate for the first anchor point
// x2, y2 is the coordinate of the first control point
// x3, y3 is the coordinate of the second control point
// x4, y4 is the coordinate of the second anchor point

// Curve 2 Control Points
stroke(#F1E6D4);
strokeWeight(2);
line(350, 75, 500, 25);
line(350, 125, 500, 175);

// Curve 2
stroke(#BA3D49);
strokeWeight(3);
bezier(350, 75, 500, 25, 500, 175, 350, 125);

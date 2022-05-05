// Drawing Arcs


size(600, 200);
smooth();

strokeWeight(5);
// This line sets the thickness of the arc lines

// General Format for the arc command is as follows:
// arc(x position, y position, width, height, start, stop);
// x and y coordinates are for the center of the arc.
// The start and stop of the arc is measured in radians and
// start at 3 o'clock on the circle

// 1st arc
arc(100, 100, 75, 75, 0, radians(90));
// This line draws a quarter of an arc. The location is 100 pixels
// over and 100 pixels down. It is 75 pixels tall and 75 pixels wide.
// It starts a 0, which means at 3 o'clock, and the arc is drawn clockwise.
// 

// 2nd arc
noFill();
// This line removes the fill
arc(233, 100, 75, 75, 0, radians(180));

// 3rd arc
fill(0, 191, 255);
// This line creates a fill in RGB format
noStroke();
// Removes the outline
arc(367, 100, 75, 75, radians(0), radians(270));

// 4th arc
stroke(100);
// This line sets the colour of the stroke to black
arc(500, 100, 75, 75, 0, radians(360));

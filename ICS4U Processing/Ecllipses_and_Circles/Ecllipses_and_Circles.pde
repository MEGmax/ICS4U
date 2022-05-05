// Drawing Ellipses and Circles

size(600, 200);
// Size of the window

smooth();
// turn on anti-aliasing

background(#678C8B);
// background colour

noStroke();
// This line eliminates the stroke of the ellipse

fill(#8FA89B, 200);
// This line accepts two arguments. The first is the colour
// of the ellipse in hexidecimal format. The second argument
// is the alpha (transperancy 0-255) 0 being completely transparent
// and 255 being completely opaque.

ellipse(100, 100, 150, 100);
// ellipse format is as follows:
// ellipse(x position, y position, width, height)
// Note: all ellipses are drawn from their center coordinates.
// The center of this ellipse is 100 pixels over to the right
// and 100 pixels down. It is 150 wide and 100 pixels tall

fill(#A2BAB0, 200);
ellipse(200, 100, 150, 100);

fill(#D0EDDE, 200);
ellipse(300, 100, 150, 100);

fill(#8FA89B, 200);
ellipse(400, 100, 150, 100);

ellipseMode(CORNER);
// This line draws an ellipse from the top left of its
// bounding box
fill(#B3B597);
// This line draws the colour in hex
ellipse(500, 100, 150, 150);
// This line draws the ellipse

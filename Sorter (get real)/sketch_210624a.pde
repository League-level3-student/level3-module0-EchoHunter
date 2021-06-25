
//1. create an array of ints. don't initialize it yet.
int[] j;

void setup() {
  //2. set the size of your window
  size(1000,1000);

  //3. initialize your array with the built in width variable
j = new int [width];
  
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  float r = 0;
for(int i = 0; i< j.length; i++){
  r = random(height);
 j[i] = int(r); 
}
  //5. call the noStroke() method
  noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
background(20,15,200);

  //7. set the color for your graph


  //8. draw a rectangle for each int in your array.
  //   the x value will be the index of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is negative the value of the int at that element in the array
int index = 0;
for(int g : j){
 fill(155,95,20);
  rect(index,height,1,-g);
 index++;
}

  //9. call the stepSort method
  stepSort(j);

  //10. extract the code that randomizes the array into a method.
  

  //11. call the method you made in step 10 when the mouse is pressed
  if(mousePressed){
  j= randomize(j); 
  }
}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
int[] randomize (int [] b){
 b = new int [width]; 
   float x = 0;
for(int j = 0; j< b.length; j++){
  x = random(height);
 b[j] = int(x); 
}
return b;
}

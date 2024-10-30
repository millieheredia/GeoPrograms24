public class B2_TeachMeNestedLoops extends World {

  public int red;

   public int blue;

   public int green;


   public void go() {
      System.out.println("This will be printed to the  window. ");
      plane.teleport(0,0);
   
      // nested loop here for gradient backround
      for(int y=0; y<500; y=y+1){
         // This inner for loop repeats the teleport and the setPixelColor
         for(int x=0; x<1000; x=x+1){
            plane.teleport(x, y);
            plane.pausetime = 1;
            plane.setPixelColor(100,0,y/2);





         }
      }

      for(int y=0; y<400; y=y+1) // for loop for grass
      {
         // nested loop
         for (int x = 0; x < 1000; x = x + 1) {

            plane.teleport(x, y+500);
            //  plane.setPixelColor(0,x/3,0); // Fills a pixel the red, green, blue (RGB) values you set

            plane.setPixelColor(57,158,60); // Fills a pixel the red, green, blue (RGB) values you set
         }
      }
      // code for houses
      plane.teleport(400,238);
      square();
      triangle();
      plane.teleport(100,238);
      square();
      triangle();
      plane.teleport(100,550);

      // random teleport for grass
     for (int x = 0; x < 8; x = x + 1){
        plane.teleport(plane.random(59,950), plane.random(499,798));
        grass();
     }

     //nested loop for sun

      for(int row = 0; row<200; row++){
         // opening where to put picture
         for(int col=0; col<200; col++){
            red = plane.howMuchRed();
            blue = plane.howMuchBlue();
            green = plane.howMuchGreen();

            //to start the picture at this location
            plane.teleport(col+696, row+67);
            plane.pausetime = 1;
            plane.setPixelColor(red, green, blue);

            //change color
            if (red>200 && green>180 && blue>20) {
               plane.setPixelColor(200,50,90);
            }

            //making picture smaller
            plane.teleport(col*16, row*16);

         }
      }




   }


   //methods
   public void square() {
      plane.startingAngle(90);
      plane.isTrail = true;
      plane.trailWidth = 10;
      plane.move(250);
      plane.turn(90);
      plane.move(300);
      plane.turn(90);
      plane.move(250);
      plane.turn(90);
      plane.move(300);
      plane.turn(90);
   }

      public void triangle() {
         plane.startingAngle(315);
         plane.isTrail = true;
         plane.trailWidth = 8;
         plane.move(210);
         plane.turn(270);
         plane.move(210);
      }


            public void grass () {
            plane.startingAngle(45);
            plane.setColor(52, 150, 23);
            plane.isTrail = true;
            plane.trailWidth = 8;
            plane.move(40);
            plane.startingAngle(315);
            plane.move(40);
         }



      }
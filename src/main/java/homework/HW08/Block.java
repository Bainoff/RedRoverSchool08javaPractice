package homework.HW08;

public class Block {
    //TODO https://www.codewars.com/kata/building-blocks/train/java
    int width;
    int length;
    int height;


    public Block(int[] arr){
        width = arr[0];
        length = arr[1];
        height = arr[2];
    }

    public int getWidth(){
        return width;
    }

    public int getLength(){
        return length;
    }

    public int getHeight(){
        return height;
    }

   public int getVolume() {
       return getWidth() * getLength() * getHeight();
   }

    public int getSurfaceArea(){
        return 2 * getLength() * getWidth() + 2 * getLength() * getHeight() + 2 * getWidth() * getHeight();
    }
}

/**
 * This class represents a simple picture. It draws a picture of James standing
 * on his giant pumpkin!
 * You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Ryan Cathcart
 * @version 2020.09.14
 */
public class Picture
{
    private Circle pumpkin;
    private Triangle stem;
    private Triangle leftEye;
    private Triangle rightEye;
    private Square mouth1;
    private Square mouth2;
    private Square mouth3;
    private Person james;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        pumpkin = new Circle();
        stem = new Triangle(); 
        leftEye = new Triangle();
        rightEye = new Triangle();
        mouth1 = new Square();
        mouth2 = new Square();
        mouth3 = new Square();
        james = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            pumpkin.changeColor("yellow");
            pumpkin.moveHorizontal(-90);
            pumpkin.moveVertical(-30);
            pumpkin.changeSize(230);
            pumpkin.makeVisible();
            
            stem.changeColor("green");
            stem.changeSize(80, 30);
            stem.moveHorizontal(45);
            stem.moveVertical(-140);
            stem.makeVisible();
            
            leftEye.changeColor("black");
            leftEye.changeSize(40, 40);
            leftEye.moveHorizontal(0);
            leftEye.moveVertical(-30);
            leftEye.makeVisible();
            
            rightEye.changeColor("black");
            rightEye.changeSize(40, 40);
            rightEye.moveHorizontal(90);
            rightEye.moveVertical(-30);
            rightEye.makeVisible();
            
            mouth1.changeColor("black");
            mouth1.changeSize(20);
            mouth1.moveHorizontal(-65);
            mouth1.moveVertical(95);
            mouth1.makeVisible();
            
            mouth2.changeColor("black");
            mouth2.changeSize(20);
            mouth2.moveHorizontal(-44);
            mouth2.moveVertical(95);
            mouth2.makeVisible();
            
            mouth3.changeColor("black");
            mouth3.changeSize(20);
            mouth3.moveHorizontal(-86);
            mouth3.moveVertical(95);
            mouth3.makeVisible();
            
            james.changeColor("black");
            james.moveHorizontal(5);
            james.moveVertical(-150);
            james.makeVisible();

            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        pumpkin.changeColor("black");
        stem.changeColor("black");
        leftEye.changeColor("white");
        rightEye.changeColor("white");
        mouth1.changeColor("white");
        mouth2.changeColor("white");
        mouth3.changeColor("white");
        james.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        pumpkin.changeColor("yellow");
        stem.changeColor("green");
        leftEye.changeColor("black");
        rightEye.changeColor("black");
        mouth1.changeColor("black");
        mouth2.changeColor("black");
        mouth3.changeColor("black");
        james.changeColor("black");
    }
}

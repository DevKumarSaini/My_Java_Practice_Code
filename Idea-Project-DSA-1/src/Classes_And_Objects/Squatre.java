package Classes_And_Objects;

public class Squatre {
    int SidesOfSquare;
    Squatre(int sidesOfSquare){
        this.SidesOfSquare=sidesOfSquare;
    }

    public int calculatingAreaOfSquare(){
        return this.SidesOfSquare*this.SidesOfSquare;
    }
    public int calculatingPerimeterOfSquare(){
        return this.SidesOfSquare+this.SidesOfSquare+this.SidesOfSquare+this.SidesOfSquare;  // Total of sides is perimeter of square
    }
    public void displayingSidesOfSquares(){
        System.out.println(this.SidesOfSquare);
    }

    public static void main(String[] args) {
        Squatre object1= new Squatre(40);
        System.out.println("Area of Square is "+object1.calculatingAreaOfSquare());
        System.out.println("Perimeter of Square is "+object1.calculatingPerimeterOfSquare());
        object1.displayingSidesOfSquares();

    }
}

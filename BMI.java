package Labs.Week_4;
import java.util.Scanner;
public class BMI 
{
    final double LBTOKG = 0.45359237;
    final double FEETTOMETRE = 0.0254;
    private double weight; // In pounds (lb)
    private double height; // In inches (in)
    // Constructor default
    public BMI()
    {

    }
    // Constructor with Parameters
    public BMI(double weight, double height)
    {
        this.weight = weight;
        this.height = height;
    }
    public double calculateBMI()
    {
        double weightkg = this.weight*LBTOKG; 
        double heightmetre = this.height*FEETTOMETRE;
        double bmi = weightkg/(heightmetre*heightmetre);
        return bmi;
    }
    public String calculateRange()
    {
        String weightrange = "";
        double bmi = calculateBMI();
        if(bmi < 18.5)
        {
            weightrange = "Underweight";
        }
        else if(bmi >=18.5 && bmi < 25.0)
        {
            weightrange = "Normal";
        }
        else if(bmi >=25.0 && bmi < 30.0)
        {
            weightrange = "Overweight";
        }
        else if(bmi >= 30.0)
        {
            weightrange = "Obese";
        }
        else
        {
            System.out.println("Error has occured");
        }
        return weightrange;
    }
    // Getter and Setters
    public double getWeight() 
    {
        return this.weight;
    }
    public double getHeight()
    {
        return this.height;
    }
    public void setWeight(double weight) 
    {
        this.weight = weight;
    }
    public void setHeight(double height) 
    {
        this.height = height;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double inputweight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double inputheight = input.nextDouble();
        BMI p1 = new BMI(inputweight,inputheight);
        System.out.println("BMI is "+p1.calculateBMI());
        System.out.println(p1.calculateRange());
        input.close();
    }
}

package lang.print.gaps.task5;

//Create a program that will perform simple division of numbers, you will be given a number and your task will
// be to create a program that divides a number by 5 and print correct result:
public class NumberDivider {
    void divide(int toBeDivided) {
        float divided = (float)toBeDivided / 5;
        System.out.println(divided);
    }

    public static void main(String[] args) {
        NumberDivider divider = new NumberDivider();
        divider.divide(19);
    }
}

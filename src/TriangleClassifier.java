import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        System.out.println("Nhập 3 cạnh của tam giác:");
        Scanner scanner = new Scanner(System.in);
        int firstSide = scanner.nextInt();
        int secondSide = scanner.nextInt();
        int thirdSide = scanner.nextInt();
        System.out.println(typeOfTriangle(firstSide, secondSide, thirdSide));
    }

    public static String typeOfTriangle(int a, int b, int c){
        String result;
        if (a <= 0 || b <= 0 || c <= 0){
            result = "Đây không phải tam giác";
        } else if (a + b > c && a + c > b && b + c > a){
            if (a == b){
                if (a == c){
                    result = "Đây là tam giác đều";
                } else {
                    result = "Đây là tam giác cân";
                }
            } else {
                result = "Đây là tam giác thường";
            }
        } else {
            result = "Đây không phải tam giác";
        }
        return result;
    }
}

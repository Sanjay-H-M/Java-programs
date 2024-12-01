import mypack.MyPackageClass;

public class PackageDemo{
    public static void main(String[] args) {
        MyPackageClass myPackageObject = new MyPackageClass();
        myPackageObject.displayMessage();
        int result = MyPackageClass.addNumbers(5, 4);
        System.out.println("Result of adding numbers" + result);
    }
}
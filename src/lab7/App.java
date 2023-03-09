package lab7;

public class App {
    public static void main(String[] args) {

        System.out.println("Flyweight example: ");
        StarFactory starFactory = new StarFactory();
        for (int i = 0; i < 10; i++) {
            switch (i % 3) {
                case 0 -> starFactory.createStar(SpectralType.M);
                case 1 -> starFactory.createStar(SpectralType.G);
                case 2 -> starFactory.createStar(SpectralType.A);
            }
        }

        HeadDepartment headDepartment = new HeadDepartment(
                3, "Head department");
        

        headDepartment.printDepartmentName();

    }
}

public class Main {
    public static void main(String[] args) {
        // задача 1
        var boxer1Weght = 78.2;
        var boxer2Weght = 82.7;
        System.out.println("общий вес двух бойцов:" + (boxer1Weght + boxer2Weght));
        System.out.println("разница между весами бойцов:" + (boxer2Weght - boxer1Weght));

        // Задача 2
        System.out.println("разница между весами бойцов: (1 способ)" + (boxer2Weght - boxer1Weght));
        System.out.println("разница между весами бойцов: (2 способ)" + (boxer2Weght % boxer1Weght));

        // Задача 3
        var totalWorkingHours = 640;
        var hoursWorkmanDay = 8;
        var totalEmployees = totalWorkingHours / hoursWorkmanDay;
        System.out.println("Всего работников в компании - : " + totalEmployees + "человек");

        totalEmployees = totalEmployees + 94;
        totalWorkingHours = totalEmployees * hoursWorkmanDay;
        System.out.println("Если в компании работает "  + totalEmployees +  " человека, то всего " + totalWorkingHours + " часов работы может быть поделено между сотрудниками ");

    }
}
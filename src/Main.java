public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух бойцов " + totalBoxersWeight + " кг");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе двух бойцов " + weightDifference + " кг");
        System.out.println("Или");
        var weightDifference1 = firstBoxerWeight - secondBoxerWeight;
        System.out.println("Разница в весе двух бойцов " + weightDifference1 + " кг");
        System.out.println("Или");
        var weightDifference2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе двух бойцов " + weightDifference2 + " кг");

        var generalOpeningHours = 640;
        var oneEmployeeWorks = 8;
        var numberOfCompanyEmployees = generalOpeningHours / oneEmployeeWorks;
        System.out.println("Всего работников в компании" + numberOfCompanyEmployees + " человек");
        var newNumberOfEmployees = numberOfCompanyEmployees + 94;
        var newEmployeeHours = generalOpeningHours / newNumberOfEmployees;
        System.out.println("Если в компании работает " + newNumberOfEmployees + " человека, то всего по " + newEmployeeHours + " часа работы может быть поделено между сотрудниками");


    }
}
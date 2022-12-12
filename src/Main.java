import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Задание 1,2,3,4,5
        System.out.println("Задание 1,2,3,4,5");

        Human maxim = new Human("Максим ", "Минск", -1988, "");
        maxim.print();
        Human anna = new Human("Аня ", "Москва", -1993, "методиста образовательных программ");
        anna.print();
        Human katy = new Human("", "Калининград", 1992, "продакт-менеджера");
        katy.print();
        Human artem = new Human("Артём ", "Москва", 1995, "директора по развитию бизнеса");
        artem.print();
        Human vladimir = new Human("Владимир ", "Казань", 2001, null);
        vladimir.print();

        System.out.println(" ");


        Car lada = new Car("Lada", "Granta", 1.7,
                "Желтый", 2015, "Россия", "универсал", 5);
        lada.setSummerTyres(false);
        lada.setKey(new Car.Key(true, true));
        lada.setInsurance(new Car.Insurance(LocalDate.now(), 40_000, "11111"));
        lada.getInsurance().printInfoExpired();
        lada.getInsurance().printInfoNumber();

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0,
                "Черный", 2020, "Германия", "универсал", 5);
        Car bmw = new Car("BMW", "Z8", 3.0,
                "Черный", 2021, "Германия", "универсал", 5);
        Car kia = new Car("KIA", "Sportage", 2.4,
                "Красный", 2018, "Южная Корея", "универсал", 5);
        Car hyundai = new Car("Hyundai", "Avante", 1.6,
                "Оранжевый", 2016, "Южная Корея", "универсал", 5);


        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);

        System.out.println(" ");

        Flower rosa = new Flower("Роза", "Голландия ", 35.59);
        System.out.println(rosa);
        Flower hrizantema = new Flower("Хризантема", null, 15);
        hrizantema.setLifeSpan(5);
        System.out.println(hrizantema);
        Flower pion = new Flower("Пион", "Англия ", 69.9);
        pion.setLifeSpan(1);
        System.out.println(pion);
        Flower hipsofila = new Flower("Гипсофила", "Турция ", 19.5);
        hipsofila.setLifeSpan(10);
        System.out.println(hipsofila);

        Bouquet bouquet = new Bouquet(
                new Flower[]{
                        rosa, rosa, rosa,
                        hrizantema, hrizantema, hrizantema, hrizantema, hrizantema,
                        hipsofila
                }
        );
        bouquet.printInfo();

    }

    private static void printInfo(Car car) {
        System.out.println(
                car.getBrand() + " " + car.getModel() +
                        ", Объем двигателя: " + car.getEngineVolume() +
                        ", Цвет: " + car.getColor() +
                        ", Год производства: " + car.getProductionYear() +
                        ", Страна производства: " + car.getProductionCountry() +
                        ", Коробка передач: " + car.getGears() +
                        ", Тип кузова: " + car.getBody() +
                        ", Регистрационный номер: " + car.getNumber() +
                        ", Количество мест: " + car.getSeats() +
                        ", Тип шин: " + (car.isSummerTyres() ? "летняя " : "зимняя ") + "резина" +
                        ", Ключ: " + (car.getKey().isWithoutKeyAccess() ? "доступ без ключа " :
                        " доступ с ключом ") + (car.getKey().isRemoteRun() ? "дистанционный запуск " :
                        " обычный запуск ") +
                        ", Номер страховки: " + car.getInsurance().getNumber() +
                        ", Стоимость страховки: " + car.getInsurance().getCost() +
                        ", Срок действия страховки: " + car.getInsurance().getExpireDate() +
                ".");

    }

}
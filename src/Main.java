public class Main {
    public static void main(String[] args) {

        // var priceTicket - стоимость билета
        int priceTicket = 12510;
        // var bonusRation - стоимость бонусной мили в денежных единицах
        int bonusRatio = 20;
        // var milesBuy - количество бонусных миль за покупку билета
        // Дробную часть бонусной мили отбрасываем
        int milesBuy = priceTicket / bonusRatio;

        // Выводим количество начисленных бонусных миль
        System.out.println("За приобретение билета нашей авиакомпании Вам начислено " + milesBuy + " бонусных миль.");
    }
}
public class FinancialForecasting {

    public static double forecastValue(
            double currentValue,
            double growthRate,
            int years) {

        // Base Case
        if (years == 0)
            return currentValue;

        return forecastValue(
                currentValue * (1 + growthRate),
                growthRate,
                years - 1);
    }

    public static void main(String[] args) {

        double presentValue = 10000;
        double growthRate = 0.13; // 13% growth rate
        int years = 5;

        double futureValue =
                forecastValue(presentValue,
                        growthRate,
                        years);

        System.out.println("Present Value = ₹"
                + presentValue);
        System.out.println("Growth Rate = "
                + (growthRate * 100) + "%");
        System.out.println("Future Value after "
                + years + " years = ₹"
                + futureValue);
    }
}
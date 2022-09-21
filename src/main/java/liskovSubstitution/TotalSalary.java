package liskovSubstitution;
import java.util.Arrays;
import java.util.Optional;

public class TotalSalary {

    public static Optional<Double> TotalSalary (SalariedEmployee... employees){
        return Arrays.stream(employees)
                .map(employee -> employee.getSalary())
                .reduce(Double::sum);
    }
}

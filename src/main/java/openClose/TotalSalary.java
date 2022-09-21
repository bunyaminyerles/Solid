package openClose;
import java.util.Arrays;
import java.util.Optional;

public class TotalSalary {

    public static Optional<Double> TotalSalary (Employee... employees){
        return Arrays.stream(employees)
                .map(employee -> employee.getSalary())
                .reduce(Double::sum);
    }
}

package open_csv.csv_1;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Temperature {

    @CsvBindByPosition(position = 0)
    private Double average;

    @CsvBindByPosition(position = 1)
    private Double average_max;

    @CsvBindByPosition(position = 2)
    private Double average_min;

    @CsvBindByPosition(position = 3)
    private Double record_max;

    @CsvBindByPosition(position = 4)
    private Double record_min;

    @Override
    public String toString() {
        return "Temperature{" +
                "average=" + average +
                ", average_max=" + average_max +
                ", average_min=" + average_min +
                ", record_max=" + record_max +
                ", record_min=" + record_min +
                '}';
    }
}
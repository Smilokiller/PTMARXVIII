package ua.org.oa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
public class Car {
    private String mark;
    private String Model;
    private int ProdYear;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (ProdYear != car.ProdYear) return false;
        if (mark != null ? !mark.equals(car.mark) : car.mark != null) return false;
        return Model != null ? Model.equals(car.Model) : car.Model == null;
    }


    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", Model='" + Model + '\'' +
                ", ProdYear=" + ProdYear +
                '}';
    }

    public static void main(String[] args) {
        Car dif = new Car("Porche", "911", 2018);
        Car Petroll = new Car("Porche", "911", 2018){
            @Override
            public String toString() {
                return "$classname{" +
                        "mark='" + mark + '\'' +
                        ", Model='" + Model + '\'' +
                        ", ProdYear=" + ProdYear +
                        '}';
            }
        }

    }
}

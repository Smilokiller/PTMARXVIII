package ua.org.oa;

public class Car {
    private String mark;
    private String Model;
    private int ProdYear;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getProdYear() {
        return ProdYear;
    }

    public void setProdYear(int prodYear) {
        ProdYear = prodYear;
    }

    public Car(String mark, String model, int prodYear) {

        this.mark = mark;
        Model = model;
        ProdYear = prodYear;
    }

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
        Car Petroll = new Car("Porche", "911", 2018) {
            @Override
            public String toString() {
                return "$classname{" +
                        "mark='" + getMark() + '\'' +
                        ", Model='" + getModel() + '\'' +
                        ", ProdYear=" + getProdYear() +
                        '}';
            }
        };
        System.out.println(Petroll.toString());
    }
}

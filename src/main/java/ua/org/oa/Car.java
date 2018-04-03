package ua.org.oa;


public  class Car {
    private static String mark;
    private static String Model;
    private static int ProdYear;

    public static String getMark() {
        return mark;
    }

    public static void setMark(String mark) {
        Car.mark = mark;
    }

    public static String getModel() {
        return Model;
    }

    public static void setModel(String model) {
        Model = model;
    }

    public static int getProdYear() {
        return ProdYear;
    }

    public static void setProdYear(int prodYear) {
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

    public Car(String mark, String model, int prodYear) {
        this.mark = mark;
               Model = model;
               ProdYear = prodYear;
    }

    public static void main(String[] args) {

        Car Petroll = new Car("Porche", "911", 5) {


            public String toString() {
                return  "mark " + getMark() +
                        ", Model " + getModel() +
                        ", ProdYear " + getProdYear();

            }
        };
        Car Dizel = new Car("Porche", "911", 5) {


            public String toString() {
                return  "mark " + getMark() +
                        ", Model " + getModel() +
                        ", ProdYear " + getProdYear();

            }

        };
        Car Electro = new Car("Porche", "911", 5) {


            public String toString() {
                return  "mark " + getMark() +
                        ", Model " + getModel() +
                        ", ProdYear " + getProdYear();
            }
        };

        System.out.println(Petroll);
        System.out.println(Dizel);
        System.out.println(Electro);
    }
}

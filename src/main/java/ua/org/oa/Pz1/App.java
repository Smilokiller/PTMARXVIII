package ua.org.oa.Pz1;

public class App {
    public static void main(String[] args) {
        System.out.println("Student info");
        Student Student1 =new Student("Ivan","Ivanov","75b","TM");
        System.out.println(Student1);
        System.out.println("Exams");
        Student.AddExam Exam1 = new Student.AddExam("Math", 2018,2,4);
        System.out.println(Exam1);
        Student.AddExam Exam2 = new Student.AddExam("English", 2018,2,3);
        System.out.println(Exam2);
        Student.AddExam Exam3 = new Student.AddExam("Math", 2017,2,5);
        System.out.println(Exam3);
        Student.AddExam Exam4 = new Student.AddExam("Math", 2017,1,5);
        System.out.println(Exam4);
        Student.AddExam Exam5 = new Student.AddExam("Ecology", 2017,1,0);
        System.out.println(Exam5);
        Student.AddExam Exam6 = new Student.AddExam("Physic", 2017,1,2);
        System.out.println(Exam6);

        System.out.println("Check for math exams");
        if (Exam1.Exam==Exam2.Exam)
            System.out.println("1 and 2 similar");
        if (Exam1.Exam==Exam3.Exam)
            System.out.println("1 and 3 similar");
        if (Exam1.Exam==Exam4.Exam)
            System.out.println("1 and 4 similar");
        if (Exam1.Exam==Exam5.Exam)
            System.out.println("1 and 5 similar");
        if (Exam1.Exam==Exam6.Exam)
            System.out.println("1 and 6 similar");

        Student.AddExam.getMaximum(new int[] {4,5,5});


        System.out.println("Check for 0 point exam");
        if (Exam1.Mark==0)
            Exam1.Mark =5;
        System.out.println("1 Check");
        System.out.println(Exam1);
        if (Exam2.Mark==0)
            Exam2.Mark =5;
        System.out.println("2 Check");
        System.out.println(Exam2);
        if (Exam3.Mark==0)
            Exam3.Mark =5;
        System.out.println("3 Check");
        System.out.println(Exam3);
        if (Exam4.Mark==0)
            Exam4.Mark =5;
        System.out.println("4 Check");
        System.out.println(Exam4);
        if (Exam5.Mark==0)
            Exam5.Mark =5;
        System.out.println("5 Check");
        System.out.println(Exam5);
        if (Exam6.Mark==0)
            Exam6.Mark =5;
        System.out.println("6 Check");
        System.out.println(Exam6);

        System.out.println("delete mark");
        if (Exam6.Mark==2)
            Exam6.Mark =0;
        System.out.println("6 deleted");
        System.out.println(Exam6);

    }


    }


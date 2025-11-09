class Student
{
    int Rollno;
    String Name;
    int Marks;
}

public class one
{
    public static void main(String args[])
    {
        Student obj1 = new Student();
        obj1.Rollno = 101;
        obj1.Name = "Vinay";
        obj1.Marks = 77;

        Student obj2 = new Student();
        obj2.Rollno = 102;
        obj2.Name = "Hari";
        obj2.Marks = 82;

        Student obj3 = new Student();
        obj3.Rollno = 103;
        obj3.Name = "Ravi";
        obj3.Marks = 96;

        Student students[] = new Student[3];
        students[0] = obj1;
        students[1] = obj2;
        students[2] = obj3;

        for(int i=0 ; i<students.length;i++)
        {
            System.out.println(students[i].Name + " : " + students[i].Marks);
        }
    }
}
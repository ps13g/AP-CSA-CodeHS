public class PersonRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Person ed = new Person("Wolfgang Amadeus Mozart", "January 27, 1756");
        Student al = new Student("Johann Nepomuk Hummel","November 14, 1778", 10, 4.0);
        System.out.println(ed.getName());
        System.out.println(ed.getBirthday());
        System.out.println(al.getName());
        System.out.println(al.getBirthday());
        System.out.println(al.getGrade());
        System.out.println(al.getGpa());
    }
}

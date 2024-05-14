package Assingment01;
public class TestMain {
    public static void main(String[] args) {
        Person person = new Person("ciise fahad", "warshadaha", "06188822", "ciise@gmail.com");
        Student student = new Student("faarax yaasiin", "warshada caanaha", "061888236", "faarax@gamil.com", Student.FRESHMAN);
        MyDate dateHired = new MyDate("2004-01-01");
        Employee employee = new Employee("maxamed Ali", "wadnaha", "06127233", "maxamed@gmail.com", "Xafiiska hodon", 1999, dateHired);
        Faculty faculty = new Faculty("craxmaan cali", "hilaal streat", "06199223", "craxmaan@gmai.com","Xafiiska holwadaag", 2900, dateHired, "99","3");
        Staff staff = new Staff("xafsa Nur", "sahara", "061772825", "xafsa@gmail.com","Xafiisla hilaal", 718, dateHired, "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);

    }
}

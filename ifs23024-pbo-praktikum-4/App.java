import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data mahasiswa
        // System.out.print("Masukkan NIM: ");
        String studentNIM = sc.nextLine();
        // System.out.print("Masukkan Nama: ");
        String studentName = sc.nextLine();
        // System.out.print("Masukkan Umur: ");
        int studentAge = Integer.parseInt(sc.nextLine());

        // Input data rumah dan alamat
        // System.out.print("Masukkan Model Rumah: ");
        String homeModel = sc.nextLine();
        // System.out.print("Masukkan Kota Alamat: ");
        String addressCity = sc.nextLine();
        // System.out.print("Masukkan Jalan Alamat: ");
        String addressStreet = sc.nextLine();

        // Input data kursus
        // System.out.print("Masukkan Nama Kursus: ");
        String courseName = sc.nextLine();
        // System.out.print("Masukkan Jumlah SKS Kursus: ");
        int courseCredits = Integer.parseInt(sc.nextLine());

        // Membuat objek Student, Home, dan Course
        Person person = new Student(studentNIM, studentName, studentAge);
        Home home = new Home(homeModel, person, addressCity, addressStreet);
        Course course = new Course(courseName, courseCredits);

        // Enroll course jika person adalah student
        if (person instanceof Student) {
            Student student = (Student) person;
            student.enrollCourse(course);
        }

        // Menampilkan informasi
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Age: " + person.getAge());

        if (person instanceof Student) {
            Student student = (Student) person;
            System.out.println("Student ID: " + student.getNim());
            System.out.println("Student Home Model: " + home.getModel());
            System.out.println("Student Address: " +
                    home.getAddress().getStreet() + ", " + home.getAddress().getCity());

            // Menangani kemungkinan course belum di-enroll
            Course enrolledCourse = student.getEnrolledCourse();
            if (enrolledCourse != null) {
                System.out.println("Enrolled Course: " +
                        enrolledCourse.getName() + " [" + enrolledCourse.getCredits() + "sks]");
            } else {
                System.out.println("No course enrolled yet.");
            }

            student.work();
        }

        sc.close();
    }
}

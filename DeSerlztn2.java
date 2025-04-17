import java.io.*;

class Student implements Serializable {
    int stuRollNo;
    String stuName;
}

class DeSerlztn2 {
public static void main(String args[]) throws IOException, ClassNotFoundException {
Student s1 = new Student();
	
s1.stuRollNo = 8;
s1.stuName = "Ayush";

FileInputStream fis = new FileInputStream("India.txt");
       
ObjectInputStream ois = new ObjectInputStream(fis);
 
Student s2 = (Student) ois.readObject(); // Typecasting the readObject result to Student
ois.close();

        // Now, you can use s2, the deserialized object
System.out.println("Deserialized Object:");
System.out.println("Roll No: " + s2.stuRollNo);
System.out.println("Name: " + s2.stuName);
}
}

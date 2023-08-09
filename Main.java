import javax.swing.plaf.SpinnerUI;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
                //My class
/*
        //String[] Lessons1 = {"Tecnical lesson"};
        MyClass person =new MyClass("Kandybek","Isaev", 16,Lessons1 , "Lagman");
       person.Demokrat();
        System.out.println();
       MyClass person2=new MyClass();
       person2.Demokrat();

 */
                //Person,car,school,universyty
/*
                Person[] person = new Person[3];
                person[0] = new Person();
                person[0].setName("Muktar");
                person[0].setAge(17);

                person[1] = new Person();
                person[1].setName("Beka");
                person[1].setAge(17);

                person[2] = new Person();
                person[2].setName("Nurik");
                person[2].setAge(25);

                Car[] car = new Car[3];
                car[0] = new Car();
                car[0].setMarka("Honda");
                car[0].setYaer(2014);
                car[0].setPrice("20000$");

                car[1] = new Car();
                car[1].setMarka("Nissan");
                car[1].setYaer(2004);
                car[1].setPrice("9000$");

                car[2] = new Car();
                car[2].setMarka("Lexus");
                car[2].setYaer(2023);
                car[2].setPrice("100000$");

                School[] school = new School[3];
                school[0] = new School();
                school[0].setName("№66");
                school[0].setYear(1950);
                school[0].setLocation("Bishkek");

                school[1] = new School();
                school[1].setName("№72");
                school[1].setYear(1968);
                school[1].setLocation("Bishkek");

                school[2] = new School();
                school[2].setName("№40");
                school[2].setYear(1976);
                school[2].setLocation("Bishkek");

                University[] university = new University[3];
                university[0] = new University();
                university[0].setName("Jusup Balasagyn");
                university[0].setYear(1934);
                university[0].setLocation("Kara Balta");

                university[1] = new University();
                university[1].setName("Manas");
                university[1].setYear(1956);
                university[1].setLocation("Bishkek");

                university[2] = new University();
                university[2].setName("Sayakbai Karalaev");
                university[2].setYear(1943);
                university[2].setLocation("Bishkek");

                System.out.println("Schools:");
                for (School scu : school) {
                    System.out.println(scu.getName() + " - " + scu.getYear() + " - " + scu.getLocation());
                }
        System.out.println();
                System.out.println("Universities:");
                for (University univ : university) {
                    System.out.println(univ.getName() + " - " + univ.getYear() + " - " + univ.getLocation());
                }
        System.out.println();
                System.out.println("Cars:");
                for (Car cr : car) {
                    System.out.println(cr.getMarka() + " - " + cr.getYaer() + " - " + cr.getPrice());
                }
        System.out.println();
                System.out.println("Persons:");
                for (Person pr : person) {
                    System.out.println(pr.getName() + " - " + pr.getAge());
                }

 */
                //Nasledstvie
/*
        Programmer obj1 = new Programmer ("Maks", "Brain",1);
        Dancer obj2 = new Dancer("Monika", "Stars",2);
        Singer obj3 = new Singer("David", "On the Galaxy",3);


        obj1.toString();
        obj2.toString();
        obj3.toString();


        System.out.println(obj1.toString());
        obj1.pacan();
        System.out.println();
        System.out.println(obj2.toString());
        obj2.devochka();
        System.out.println();
        System.out.println(obj3.toString());
        obj3.pacan2();


 */
                //5 person with construktors and 5 with set
/*
                Person3 person3 = new Person3("Larisa", 34, "Female", "France", "Paris");
                Person3 person31 = new Person3("Myky", 23, "Male", "USA", "Chicago");
                Person3 person32 = new Person3("Tony", 56, "Male", "UK", "London");
                Person3 person33 = new Person3("Angelina", 12, "Female", "Canada", "Toronto");
                Person3 person34 = new Person3("Kharif", 43, "Male", "Emirates", "Dubai");

                Person3 person35 = new Person3();
                person35.setName("Bakha");
                person35.setAge(74);
                person35.setGender("Male");
                person35.setCountry("Kyrgyzystan");
                person35.setCity("Byshkek");

                Person3 person36 = new Person3();
                person36.setName("Nurik");
                person36.setAge(54);
                person36.setGender("Male");
                person36.setCountry("Kyrgyzystan");
                person36.setCity("Naryn");

                Person3 person37 = new Person3();
                person37.setName("Sasha");
                person37.setAge(27);
                person37.setGender("Male");
                person37.setCountry("Russia");
                person37.setCity("Moscow");

                Person3 person38 = new Person3();
                person38.setName("Elisaveta");
                person38.setAge(18);
                person38.setGender("Female");
                person38.setCountry("Russia");
                person38.setCity("Vladivastok");

                Person3 person39 = new Person3();
                person39.setName("Svetlana");
                person39.setAge(53);
                person39.setGender("Female");
                person39.setCountry("Ukraina");
                person39.setCity("Byshkek");

                Person3[] people = {person3, person31, person32, person33, person34, person35, person36, person37, person38, person39};

                System.out.println("All People: ");
                for (Person3 ddd : people) {
                        System.out.println(ddd.toString());


                }
                System.out.println("----------------------------------------------------------------");
                Person3 oldestPerson = getMaxAgePerson(people);
                System.out.println("The oldest Person: ");
                System.out.println(oldestPerson.toString());

                Person3[] females = getPeopleByGender(people, "Female");
                Person3[] males = getPeopleByGender(people, "Male");
                System.out.println("----------------------------------------------------------------");
                System.out.println("Female persons:");
                for (Person3 female : females) {
                        System.out.println(female.toString());
                }

                System.out.println("----------------------------------------------------------------");


                System.out.println("Male persons:");
                for (Person3 male : males) {
                        System.out.println(male.toString());
                }
        }

        public static Person3 getMaxAgePerson(Person3[] people) {
                Person3 maxAgePerson = people[0];
                for (int i = 1; i < people.length; i++) {
                        if (people[i].getAge() > maxAgePerson.getAge()) {
                                maxAgePerson = people[i];
                        }
                }
                return maxAgePerson;
        }


        public static Person3[] getPeopleByGender(Person3[] people, String gender) {
                int count = 0;
                for (Person3 person3 : people) {
                        if (person3.getGender().equals(gender)) {
                                count++;
                        }
                }

                Person3[] result = new Person3[count];
                int index = 0;
                for (Person3 person3 : people) {
                        if (person3.getGender().equals(gender)) {
                                result[index] = person3;
                                index++;
                        }
                }
                return result;

 */
                Scanner scanner=new Scanner(System.in);
                double arrra=scanner.nextDouble();
                System.out.println("Radius: ");
                double ddd=Circle.area(arrra);
               double sss= Circle.circumference(arrra);
                System.out.println("Area Ansver: "+ddd);
                System.out.println("Circumference Ansver: "+sss);
        }
}



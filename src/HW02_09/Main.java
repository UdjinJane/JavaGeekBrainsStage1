package HW02_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
    // Объявляем коллекцию студентов.
        List<SuStudent> students = new ArrayList<SuStudent>();
    // Наполняем коллекцию студентов в цикле.
    for (int i = 1; i<11; i++) {
        SuStudent student = new SuStudent();
        student.setName("Student-" + i);
    // Генератор, размножающий курсы для студентов в прогрессии.
        for (int v = 1; v<=i; v++){
            for (int y = 0; y<v; y++){
                SuCourse course = new SuCourse("Predmet-" + v);
                student.setCource(course);

            }
        }
        // Добавляем студента с его курсами в лист студентов.
        students.add(student);
    }

        // Список уникальных студентов.
        System.out.println("Листинг имён студентов:");
        students.stream()
                .forEach(System.out::println);

        // Список уникальных курсов.
        System.out.println("Список уникальных курсов: ");
        List<String> uniqueCourses = uniqCoursesNames(students);
        uniqueCourses.stream()
                .forEach(System.out::println);

        // Список любознательных.
        System.out.println("Самые любознательные: ");
        superStudentOnCourse(students).stream().sorted(new sComparator())
                .map(luboznatelniye -> luboznatelniye.getName())
                .forEach(System.out::println);

        // Список ленивых.
        System.out.println("Самые ленивые: ");
        badStudentOnCourse(students).stream()
                .map(leniviye -> leniviye.getName())
                .forEach(System.out::println);

        // Связка студенты - курс по условию.
        Course course = new SuCourse("Predmet-2");
        System.out.printf("Студенты на курсе %s: \n", course.getName());
        studentsOnCourse(students, course).stream()
                .map(stud -> stud.getName())
                .forEach(System.out::println);
    }

// Написать функцию, принимающую список Student и возвращающую список уникальных курсов,
// на которые подписаны студенты.
        static List<String> uniqCoursesNames(List<SuStudent> students) {
            List<String> uniqueCourses =
                    students.stream()
                            .map(ustudents -> ustudents.getAllCourses())
                            // Плющим массив.
                            .flatMap(Collection::stream)
                            // выдергиваем имена в мапу.
                            .map(c -> c.getName())
                            // Это лишнее, но пусть будет.
                            .distinct()
                            .sorted()
                            .collect(Collectors.toList());

            return uniqueCourses;
        }

    // Любознательные на курсе. Тройка лучших.
    static List<Student> superStudentOnCourse(List<SuStudent> students) {
        List<Student> superStudents =
                students.stream()
                        // Это нам показали на уроке.
                        .sorted((stud0, stud1) -> stud1.getAllCourses().size() - stud0.getAllCourses().size())
                        // Обрезаем количество.
                        .limit(3)
                        // Результат в лист.
                        .collect(Collectors.toList());
        return superStudents;
    }

    // Ленивые на курсе. Тройка ленивых.
    static List<Student> badStudentOnCourse(List<SuStudent> students) {
        List<Student> badStudents =
                students.stream()
                        // Это нам показали на уроке.
                        .sorted((stud0, stud1) -> stud0.getAllCourses().size() - stud1.getAllCourses().size())
                        // Обрезаем количество.
                        .limit(3)
                        // Результат в лист.
                        .collect(Collectors.toList());
        return badStudents;
    }

// Написать функцию, принимающую на вход список Student и экземпляр Course,
// возвращающую список студентов, которые посещают этот курс.
    static List<Student> studentsOnCourse(List<SuStudent> students, Course course) {
        String courseName = course.getName();
        List<Student> studentsOnCourse =
                students.stream()
                        .filter(stud -> stud.getAllCourses().stream()
                                .filter(c -> c.getName().equals(courseName))
                                .count() > 0)
                        .collect(Collectors.toList());
        return studentsOnCourse;
    }

    // Играюсь с компаратором.
    static  class sComparator implements Comparator<Student>{
        public int compare (Student a, Student b) {

            return a.getName().getBytes().toString().compareTo(b.getName().getBytes().toString());
        }

    }

    }


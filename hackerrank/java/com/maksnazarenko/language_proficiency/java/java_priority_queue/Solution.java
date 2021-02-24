package com.maksnazarenko.language_proficiency.java.java_priority_queue;

import java.util.*;

/*
 * Create the Student and Priorities classes below.
 */
class Student implements Comparable<Student> {
    double cgpa;
    String name;
    int id;

    Student(String name, double cgpa, int id) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    @Override
    public int compareTo(Student student) {
        if (getCGPA() == student.getCGPA()) {
            if (getName().compareTo(student.getName()) == 0) {
                return Integer.compare(getID(), student.getID());
            } else {
                return getName().compareTo(student.getName());
            }
        } else if (getCGPA() > student.getCGPA()) {
            return -1;
        } else {
            return 1;
        }
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        for (String event : events) {
            String[] command = event.split(" ");
            if (command[0].equals("ENTER")) {
                priorityQueue.add(new Student(
                                            command[1],
                                            Double.parseDouble(command[2]),
                                            Integer.parseInt(command[3])));
            } else {
                priorityQueue.poll();
            }
        }
        while (priorityQueue.size() > 1) {
            System.out.println(priorityQueue.poll().name);
        }
        return new ArrayList<>(priorityQueue);
    }
}
/*
 * Create the Student and Priorities classes above.
 */
public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}

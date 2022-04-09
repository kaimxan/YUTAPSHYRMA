package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Кундорду жазыныз:");
        Week week=Week.valueOf(scanner.nextLine());
        switch (week){
            case MONDEY -> System.out.println("Дуйшомбу куну технический джава сабагын окуйм");
            case THUSDAY -> System.out.println("Шейшемби куну Англис тилин окуйм");
            case WEDNESDAY -> System.out.println("Шаршемби куну технический джава сабагын окуйм");
            case TUESDAY -> System.out.println("Бейшемби джава практика сабагын окуйм");
            case FRIDAY -> System.out.println("Жума куну технический джава сабагын окуйм");
            case SUNDAY -> System.out.println("Ишемби куну Англис тилин окуйм");
        }



    }
}

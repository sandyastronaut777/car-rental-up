package com.example.carrental.utility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction;

import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
public class StreamTest {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name;
//        int cgpa;
//        String board;
//        ArrayList<String> list = new ArrayList<>();
//        System.out.println("Enter name");
////        System.out.println("Enter cgpa");
//        System.out.println("Enter board");
//        for (int a = 1; a < 4; a++) {
//            name = sc.nextLine();
//            list.add(name);
//            board = sc.nextLine();
//            list.add(board);
//
////            System.out.println(list);
//        }
////        ArrayList<StreamTest> st = new ArrayList<StreamTest>();
//
//            List<String> boardList = list.stream()
//                    .filter(p -> p.equalsIgnoreCase("CBSE"))
//                    .collect(Collectors.toList());
//            System.out.println(boardList);
//
//        }

        List<Integer> n = Arrays.asList(10, 1, 8, 2, 3, 4, 5);
        System.out.println(n);
        List<Integer> square = n.stream().map(i -> i * i).collect(Collectors.toList()); //Gen_Necc
        System.out.println("Square List ->");
        System.out.println(square);
        System.out.println("Multiple with 2 ->");
        n.stream().map(i -> 2*i).forEach(p -> System.out.println(p));  //print_void, list_Gen_In_xPt
        List<Integer> fil = n.stream().filter(no -> no.equals(4)).collect(Collectors.toList());
        System.out.println("filtered list ->");
        System.out.println(fil);
        List<Integer> s = n.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted list ->");
        System.out.println(s);

    }
}


package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Member> list= Arrays.asList(
                new Member("홍길동",Member.MALE,30),
                new Member("김나리",Member.FEMALE,20),
                new Member(" 신용권", Member.MALE, 45),
                new Member("박수미", Member.FEMALE,27)
        );
        list.get(0).setName("테스트");
        Member mem=list.get(1);
        mem.setName("이건바뀌나");
        list.stream().forEach(t-> System.out.println(t.getName()));
        System.out.println("___");
        double avg=list.stream().filter(member -> member.getSex()==Member.MALE).mapToInt(Member::getAge).average().orElse(0.0);
        System.out.println(avg);

        List<String> names=Arrays.asList("홍길동","신용권","김자바","신용권","신민철");
        names.stream().distinct().forEach(n-> System.out.println(n));
        System.out.println("+++");
        names.stream().filter(n->n.startsWith("신")).forEach(n-> System.out.println(n));
        System.out.println("+++");
        names.stream().distinct().filter(n->n.startsWith("신")).forEach(n-> System.out.println(n));
        System.out.println("+++");
        List<String> inputlist1=Arrays.asList("java8 lambda","stream mapping");
        inputlist1.stream().flatMap(x->Arrays.stream(x.split(" "))).forEach(x-> System.out.println(x));
        list.stream().sorted(Comparator.reverseOrder()).forEach(member -> System.out.println(member.getAge()));
        System.out.println("+++");

        System.out.println(list.stream().peek(member -> System.out.println(member.getAge())).mapToInt(Member::getAge).sum());
    }
}

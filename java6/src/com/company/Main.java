package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        InputStream in=System.in;
        int sum=0;
        sum+=(in.read()-'0');
        sum+=(in.read()-'0');
        sum+=(in.read()-'0');

        System.out.println(sum);

    }
}

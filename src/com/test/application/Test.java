package com.test.application;

import com.sun.xml.internal.ws.util.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xp021448 on 5/25/17.
 */
public class Test {
    public  static void main(String args[])
    {


        String text = "abbbbb,,,,,v,,,,dc,,";

        text = text.substring(0, text.length() - 1) + '.';
        int i = text.lastIndexOf(text);

        System.out.println(text);
        System.out.println(i);

        String input="wanting to replace last comma to dot,and get the output;";
        String replaceWith = "8";

        //, followed by end of line
        Pattern p = Pattern.compile("$;");
        Matcher m = p.matcher(input);

        String output = m.replaceAll(replaceWith);
        System.out.println(output);

    }
}

package com.example.rest.webservices.restfulwebservices;

import java.util.Scanner;

class CaesarCipher
{
    // Encrypts text using a shift od s
    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isWhitespace(text.charAt(i)))
            {
                char ch = (char)((int)text.charAt(i));
                result.append(ch);
            }
            else if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    public static StringBuffer decrypt(String dectext, int s)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<dectext.length(); i++)
        {
            if (Character.isWhitespace(dectext.charAt(i)))
            {
                char ch = (char)((int)dectext.charAt(i));
                result.append(ch);
            }

            else if (Character.isUpperCase(dectext.charAt(i)))
            {
                char ch = (char)(((int)dectext.charAt(i) -
                        s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)dectext.charAt(i) -
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    // Driver code
    public static void main(String[] args)
    {
        String text = "innoWake rules";
        int s = 9;
        String dectext = "IUHUR";
        int t = 5;
        System.out.println("Text  : " + text);
        System.out.println("Shift : " + s);
        System.out.println("Cipher: " + encrypt(text, s));
        System.out.println("Text  : " + dectext);
        System.out.println("Shift : " + t);
        System.out.println("Cipher: " + decrypt(dectext, t));
    }
}

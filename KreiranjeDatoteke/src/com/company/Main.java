package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        java.io.File file = new java.io.File("vladan/us.gif");
        System.out.println("Does it exist? "+ file.exists());
        System.out.println("The files has "+ file.length()+ "bytes");
        System.out.println("Can it be read"+ file.canRead());
        System.out.println("Can it be wrtten?" + file.canWrite());
        System.out.println("It is a ditectory? " + file.isDirectory());
        System.out.println("It is a file" + file.isFile());
        System.out.println("It is hiden? " + file.isHidden());
        System.out.println("It is absolute? "+ file.isAbsolute());
        System.out.println("Absolute path is "+ file.getAbsolutePath());
        System.out.println("Absolute path without redudantna imena "+ file.getCanonicalPath());
        System.out.println("Last modified " + new java.util.Date(file.lastModified()));
    }
}

package no.hvl.dat100.jplab11.oppgave4;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		try {
			  BufferedWriter writer = new BufferedWriter(new FileWriter(mappe + filnavn));
		      writer.write(samling.toString());
		      writer.close();
		      return true;
		    } catch (IOException e) {
		      System.out.println("En feil har oppstått!!");
		      e.printStackTrace();
		      return false;
		    }}
	}


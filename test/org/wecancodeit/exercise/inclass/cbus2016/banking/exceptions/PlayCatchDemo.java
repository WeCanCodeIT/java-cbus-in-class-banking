package org.wecancodeit.exercise.inclass.cbus2016.banking.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class PlayCatchDemo {

	@Test
	public void throwExceptionsForMe() {
		firstMethod();
	}

	private void firstMethod() {
		System.out.println("Yay! First Method!");
		try {
			secondMethod();
		} catch (Exception exception) {
			System.out.println("I caught an exception");
		}
	}

	private void secondMethod() throws Exception {
		try {
			thirdMethod();
		} catch (Exception ex) {
			System.out.println("I just called thirdMethod from secondMethod!");
			throw ex;
		}
	}

	private void thirdMethod() throws Exception {
		Exception ex = new Exception();
		throw ex;
	}
	
	@Test
	public void tellMeAFileIsntFound() {
		try {
			callReadMethodThatThrowsFileNotFound();
		} catch (FileNotFoundException ex) {
			System.out.println("Sorry, I couldn't find your file.");
		}
	}

	private void callReadMethodThatThrowsFileNotFound() throws FileNotFoundException {
		throw new FileNotFoundException();
	}
	
	@Test
	public void tellMeSomethingElseBadHappenedWithIO() {
		try {
			callReadMethodThatThrowsIOException();
		} catch (FileNotFoundException ex) {
			System.out.println("I caught a file not found exception.");
		} catch (IOException ex) {
			System.out.println("Sorry, something else bad happened.");
		}
	}

	private void callReadMethodThatThrowsIOException() throws IOException {
		//change me to FileNotFoundException and see what happens
		throw new IOException();
	}
}

package com.wr.example.start;

import java.io.FileNotFoundException;

import com.wr.impl.ReaderDocText;

public class ExampleExtracting {

	public static void main(String[] args) throws FileNotFoundException {
		new ReaderDocText().read("/home/emiliano/workspace/words-extractor/words-ext/resources/IronMan.doc");
	}
}

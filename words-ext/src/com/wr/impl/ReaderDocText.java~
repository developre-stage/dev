package com.wr.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.wr.Reader;

public class ReaderDocText implements Reader {

	@Override
	public List<String> read(String path) throws FileNotFoundException {
		
		BufferedReader buffer = new BufferedReader(new FileReader(path));
		Set<String> words = new TreeSet<String>();
	try {	int k = 0;
			while(buffer.ready())
			{
				String line = buffer.readLine();
				Set<String> wordsLine = processSeparator(line);
				words.addAll(wordsLine);
			}
			for (String word : words) 
			{
				System.out.println(word);
				k++;
			}
			
			System.out.println("Number word: " + k);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public Set<String> processSeparator(String line)
	{
		String[] separators = {":",";","\\.","\\-","=","\"","\n",",","[1234567890]","\\?","!","“","”","–"};
		String[] values = line.split(" ");
		TreeSet<String> setWords = new TreeSet<String>();
		for(int i = 0; i < values.length; i++)
		{
					String wd = values[i];
					
					for(int k = 0; k < separators.length; k++)	
					{
						wd = wd.toLowerCase().trim().replaceAll(separators[k], " ");
					}
					
					
						String[] wdArr = wd.split(" ");
						for(int k = 0; k < wdArr.length; k++)	
						{
							if(wdArr[k] != null && !wdArr[k].equals(""))
								setWords.add(wd);
						}
				
					
				
		 }
		
		
		return setWords;
	}
	
	private boolean excludeWord(String[] separators,String word)
	{
		for(int k = 0; k < separators.length; k++)
		{
			if(word.contains(separators[k]))
				return false;
		}
		return true;
	}
	
}

package com.wr;

import java.io.FileNotFoundException;
import java.util.List;

public interface Reader {
	public List<String> read(String path) throws FileNotFoundException;
}

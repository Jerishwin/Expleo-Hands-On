package api.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

	public static Object[][] getData(String fileName) {

		List<Object[]> data = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("src/test/resources/testData/" + fileName))) {

			String line;

			// Skip header
			br.readLine();

			while ((line = br.readLine()) != null) {
				data.add(line.split(",", -1));
			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		return data.toArray(new Object[0][]);
	}
}

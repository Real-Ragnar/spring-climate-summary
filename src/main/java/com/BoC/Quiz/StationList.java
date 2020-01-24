package com.BoC.Quiz;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class StationList {
	private static final String CSV_FILE_PATH = "eng-climate-summary.csv";

	public List<Station> getStationList() throws IOException, CsvValidationException {
		List<Station> listStation = new ArrayList<>();

		try (Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE_PATH));
				CSVReader csvReader = new CSVReader(reader);) {
			// Reading Records One by One in a String array
			String[] nextRecord;
			while ((nextRecord = csvReader.readNext()) != null) {
				System.out.println("StationList.java invoked");
				listStation.add(new Station(nextRecord[0], nextRecord[2], nextRecord[3]));
				// listStation.add(new Station(nextRecord[0], nextRecord[1],
				// nextRecord[2],nextRecord[3], nextRecord[4], nextRecord[5]));

			}
		}

		return listStation;
	}
	public List<Station> getDetailedStationList() throws IOException, CsvValidationException {
		List<Station> listStation = new ArrayList<>();

		try (Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE_PATH));
				CSVReader csvReader = new CSVReader(reader);) {
			// Reading Records One by One in a String array
			String[] nextRecord;
			while ((nextRecord = csvReader.readNext()) != null) {
				System.out.println("StationList.java invoked");
				listStation.add(new Station(nextRecord[0], nextRecord[1], nextRecord[2],nextRecord[3], nextRecord[4], nextRecord[5]));
			}
		}

		return listStation;
	}

}

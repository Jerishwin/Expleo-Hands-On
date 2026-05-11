package com.auto;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PDFDownloadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String downloadFilePath = System.getProperty("user.dir")+File.separator+"downloads";
		
		ChromeOptions options = new ChromeOptions();
		Map<String, Object>prefs = new HashMap<>();
		prefs.put("plugins.always_open_pdf_externally", true);
		prefs.put("download.default_directory", downloadFilePath);
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		WebElement downloadLink = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
		downloadLink.click();
		
		Thread.sleep(5000);
		File downloadFile = new File(downloadFilePath+"/samplefile.pdf");
		if(downloadFile.exists()) {
			System.out.println("File is downloaded");
		}else {
			System.out.println("File is not downloaded");
		}
		
		PDDocument document= null;
		
		try {
			document = Loader.loadPDF(downloadFile);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			pdfStripper.
			String text = pdfStripper.getText(document);
			
			document.close();
			System.out.println("Text in PDF: "+text);
		}catch(IOException e) {
			System.err.println("An erroe occured: "+e.getMessage());
			e.printStackTrace();
		}
	}

}

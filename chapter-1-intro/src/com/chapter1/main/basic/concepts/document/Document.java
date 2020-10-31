package com.chapter1.main.basic.concepts.document;

// Document isminde bir sınıf oluşturduk.
// Sınıflar : Fonksiyonlar'dan ve Değişkenler'den oluşur.

public class Document {

	// Nesne Değişkenleridir.
	// Bu değişkenler Document isimli sınıfa ait nitelikleri belirtir.
	
	// Dokümanın dosya ismini belirtir.
	private String fileName;
	
	// Dokümanın dosya uzantısını belirtir.
	private String fileExtension;
	
	// Dokümanın dosya içeriğini ifade eder.
	private byte[] fileContent;
	
	// Kurucu fonksiyondur
	public Document()
	{
		this.fileName = "";
		this.fileExtension = "";
		this.fileContent = new byte[0];
	}
	
	// Parametre alan kurucu fonksiyondur
	public Document(String fileName, String fileExtension, byte[] fileContent) 
	{
		this.fileName = fileName;
		this.fileExtension = fileExtension;
		this.fileContent = fileContent;
	}
	
	// Java'da fonksiyonlar değer döndürebilir.
	// Bu fonksiyon byte dizisi döndürür.
	public byte[] getFileContent() {
		// burası fonksiyonun gövdesidir.
		return this.fileContent;
	}
	
	public String getFileName() {
		// burası fonksiyonun gövdesidir.
		return this.fileName;
	}
	
	public String getFileExtension() {
		// burası fonksiyonun gövdesidir.
		return this.fileExtension;
	}
	
	public String getFullFileName() {
		
		// Dosya ismini uzantısıyla birlikte verir.
		String fullFileName = this.getFileName() + "." + this.getFileExtension();
		
		// 'fullFileName' yerel değişkendir. Sadece fonksiyon kapsamında geçerlidir.
		// süslü parantezler bitince bu değişkenin yaşamı sonlanır.
		
		// fonksiyondan değer döndürmek için 'return' anahtar kelimesi kullanılır.
		return fullFileName;
	}
	
	public int getFileSize() {
		
		return this.fileContent.length;
	}
}

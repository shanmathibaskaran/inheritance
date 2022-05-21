package org.lang;

public class LanguageInfo extends StateDetails {
	public void tamilLanguage() {
		System.out.println("tamil");

	}
	public void englishLanguage() {

		System.out.println("english");
		System.out.println("American english");
		
	}
	public void hindiLanguage() {

		System.out.println("hindi");
	}
	public static void main(String[] args) {
		LanguageInfo l =new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		l.southIndia();
		l.northIndia();
		

	}
}

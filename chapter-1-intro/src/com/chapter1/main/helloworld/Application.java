package com.chapter1.main.helloworld;

// Java %100 Nesne Yönelimli bir dildir.
// Bu nedenle değişkenler(variables), fonksiyonlar (methods) mutlaka sınıf (Class) içinde yer almalıdır.

/*
 * public ==> erişim belirteci (public herkese açık demek)
 * class ==> class Java'da anahtar kelimedir (keyword)
 * 'Application' ==> Sınıfa verdiğimiz isim
 */

// <modifier> class <class_name>

public class Application 
// Açılan süslü parantez sınıf kapsamının başlangıcıdır.
{
	
	public static void main(String[] args) 
	// Açılan süslü parantez fonksiyon kapsamının başlangıcıdır.
	{
		// 'println' fonksiyonu console'a mesaj yazdırmayı sağlar.
		// 'println' fonksiyonu JDK içindeki kütüphanelerden gelir. Bu fonksiyonu biz geliştirmedik.
		// Fakat, başka programcılar biz kullanabilelim diye böyle bir fonksiyon geliştirmişler.
		System.out.println("Merhaba Java Bootcamp 101!");
	
	// Kapatılan süslü parantez fonksiyon kapsamının sonudur.	
	}
	
// Kapatılan süslü parantez sınıf kapsamının sonudur.
}


package com.it.utils;

import org.jasypt.util.password.BasicPasswordEncryptor;

public class PasswordEncryptorUtils {

	public static String passwordEncryptor(String plainText) {
		BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();
		return passwordEncryptor.encryptPassword(plainText);
	}

	public static boolean checkPassword(String plainPassword, String encryptedPassword) {
		BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();
		return passwordEncryptor.checkPassword(plainPassword, encryptedPassword);
	}

}

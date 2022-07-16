package com.it.utils;

import java.io.IOException;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.github.pheerathach.ThaiQRPromptPay;
import com.google.zxing.WriterException;

@Component
public class QRPromptPayUtils {
	
	@Value("${promptpay.mobile.number}")
	private String MOBILE_NUMBER;
		
	public byte[] generateQRCodeToByteArray(BigDecimal amount) throws IOException, WriterException {
		ThaiQRPromptPay qr = new ThaiQRPromptPay.Builder().staticQR().creditTransfer().mobileNumber(MOBILE_NUMBER).amount(amount).build();
		return qr.drawToByteArray(400, 400);
	}
	
	public String generateQRCodeToBase64(BigDecimal amount) throws IOException, WriterException {
		ThaiQRPromptPay qr = new ThaiQRPromptPay.Builder().staticQR().creditTransfer().mobileNumber(MOBILE_NUMBER).amount(amount).build();
		return qr.drawToBase64(400, 400);
	}

}

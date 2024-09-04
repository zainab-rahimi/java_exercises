package com.bge.commerceEntities;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Command {
		
		private String itemType;
		private int price;
		private String referenceNum;
		
		//Constructor to initialize all attributes
		public Command(String itemType, int price, AtomicInteger counter) {
			super();
			this.itemType = itemType;
			this.price = price;
			this.referenceNum = getReference(counter);
		}


		public String getReference(AtomicInteger counter) {
			//Get the date and change the format 
			Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String formattedDate = dateFormat.format(date);
			//Get the number to increment and format it to 5 digits
			int number = counter.getAndIncrement();
			String formattedNumber = String.format("%05d", number);			
			referenceNum = formattedDate + "-" + formattedNumber;	
			return referenceNum;
		}

		public String getItemType() {
			return itemType;
		}


		public int getPrice() {
			return price;
		}

		//Getter method for referenceNum
		public String getReferenceNum() {
			return referenceNum;
		}

	
		
		
		
}

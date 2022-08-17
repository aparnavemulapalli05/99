package com.pratice.project;

public class IMBDAAA {
	 public static void main(String[] args) {
	        String actorName = "NTR";
	        int yearOfBorn = 1983;
	        int age = 2020 - yearOfBorn;

	        String[] movieTitles = {
	                "Janatha Garage", "RRR", "Adhurs",
	                "Baadshah", "Naa Alludu"
	        };

	        float[] movieRatings = {
	                7.2F, 8.0F, 6.7F,
	                6.3F, 4.8F
	        };

	        System.out.println("Actor's name: " + actorName);
	        System.out.println("Born: " + yearOfBorn + " (" + age + " years old)");

	        System.out.println("Movies:");

	        for (int i = 0; i < movieTitles.length; i++) {
	            System.out.println(movieTitles[i] + " - " + getRating(movieRatings[i]));
	        }
	    }

	    static String getRating(float rating){
	        if (rating <= 5.0){
	            return "bad";
	        } else if (rating > 5.0 && rating <= 6.5){
	            return "average";
	        } else if (rating > 6.5 && rating <= 7.0){
	            return "good";
	        } else if (rating > 7.0 && rating <= 8.0){
	            return "very good";
	        }else{
	            return "amazing";
	        }
	    }
	}


